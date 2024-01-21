package com.example.zaliczenie.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zaliczenie.Item;
import com.example.zaliczenie.MyAdapter;
import com.example.zaliczenie.R;
import com.example.zaliczenie.databinding.FragmentHomeBinding;
import com.example.zaliczenie.networking.APIs;
import com.example.zaliczenie.networking.ProductResult;
import com.example.zaliczenie.networking.RetrofitClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    RecyclerView recyclerView;

    RetrofitClient retrofitClient;
    TextView textView4;
    List<Item> message;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        message = new ArrayList<Item>();

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View huj = root.findViewById(R.id.include);

        recyclerView = huj.findViewById(R.id.recyclerView);
        kurwa();
        message.add(new Item("twoj stary","twoja stara", "moj stary","xfsdfdgzdfgdfgrsdfgzfdgfgdgfddfggfd"));
        MyAdapter myAdapter = new MyAdapter(message);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(myAdapter);

        getMessage();


        return root;
    }

    private void kurwa(){
        for(int i = 0; i<10; i++){
            message.add(new Item("sad","sad","dsa","asd"));
        }
    }
    private void getMessage() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://tgryl.pl/shoutbox/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();



        APIs apis = retrofit.create(APIs.class);

        Call<List<ProductResult>> listCall = apis.getMessage();

        listCall.enqueue(new Callback<List<ProductResult>>() {
            @Override
            public void onResponse(Call<List<ProductResult>> call, Response<List<ProductResult>> response) {
                if (!response.isSuccessful()) {

                    return;
                }

                List<ProductResult> posts = response.body();





            }

            @Override
            public void onFailure(Call<List<ProductResult>> call, Throwable t) {
                System.out.println("dsfsdf");
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    private void showMessages(ProductResult productResult){

    }
}