// Generated by data binding compiler. Do not edit!
package com.example.wordbook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.wordbook.R;
import com.example.wordbook.vocalist.VocaListViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentVocaListBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton add;

  @NonNull
  public final RecyclerView list;

  @Bindable
  protected VocaListViewModel mViewModel;

  protected FragmentVocaListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton add, RecyclerView list) {
    super(_bindingComponent, _root, _localFieldCount);
    this.add = add;
    this.list = list;
  }

  public abstract void setViewModel(@Nullable VocaListViewModel viewModel);

  @Nullable
  public VocaListViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentVocaListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_voca_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVocaListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentVocaListBinding>inflateInternal(inflater, R.layout.fragment_voca_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentVocaListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_voca_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVocaListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentVocaListBinding>inflateInternal(inflater, R.layout.fragment_voca_list, null, false, component);
  }

  public static FragmentVocaListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentVocaListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentVocaListBinding)bind(component, view, R.layout.fragment_voca_list);
  }
}