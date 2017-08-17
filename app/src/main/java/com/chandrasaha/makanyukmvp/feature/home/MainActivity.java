package com.chandrasaha.makanyukmvp.feature.home;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.chandrasaha.makanyukmvp.R;
import com.chandrasaha.makanyukmvp.adapter.PlaceAdapter;
import com.chandrasaha.makanyukmvp.base.mvp.MvpActivity;
import com.chandrasaha.makanyukmvp.model.place.Item;
import com.chandrasaha.makanyukmvp.model.place.Place;
import com.chandrasaha.makanyukmvp.util.RecyclerItemClickListener;
import com.google.android.gms.maps.model.LatLng;

import java.util.List;

import butterknife.BindView;

public class MainActivity extends MvpActivity<MainPresenter> implements MainView,SearchView.OnQueryTextListener{
    private String ll = "-7.797068,110.370529";
    private List<Item> items;

    @BindView(R.id.recycleView)
    RecyclerView recyclerView;

    @BindView(R.id.progress)
    ProgressBar progressBar;

    private LatLng latLng;
    private String query;

    @Override
    protected MainPresenter createPresenter(){
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.addOnItemTouchListener(selectItemOnRecyclerView());
        latLng = presenter.getLoacation(MainActivity.this);
        presenter.loadData(String.valueOf(latLng.latitude)+","+String.valueOf(latLng.longitude));
    }



    private RecyclerItemClickListener selectItemOnRecyclerView() {
        return new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                presenter.getItem(items.get(position),activity);
            }

            @Override
            public void onLongItemClick(View view, int position) {
                presenter.getItem(items.get(position),activity);
            }
        });
    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void getDataSuccess(Place model) {
        this.items = model.getResponse().getGroups().get(0).getItems();
        recyclerView.setAdapter(new PlaceAdapter(items,R.layout.item_place,getApplicationContext()));
    }

    @Override
    public void getDataFail(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void moveToDetail(Intent intent) {
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        setupSearchView(searchView);
        return super.onCreateOptionsMenu(menu);
    }

    private void setupSearchView(SearchView searchView) {
        searchView.setIconifiedByDefault(true);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        if (searchManager != null) {
            List<SearchableInfo> searchables = searchManager.getSearchablesInGlobalSearch();
            SearchableInfo info = searchManager.getSearchableInfo(getComponentName());
            for (SearchableInfo inf : searchables) {
                if (inf.getSuggestAuthority() != null
                        && inf.getSuggestAuthority().startsWith("applications")) {
                    info = inf;
                }
            }
            searchView.setSearchableInfo(info);
        }
        searchView.setOnQueryTextListener(this);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        presenter.stop();
        searchPlace(query);
        return false;
    }

    private void searchPlace(String query) {
        if(query!=null){
            this.query = query;
            presenter.searchLocation(ll,query);
        }
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
