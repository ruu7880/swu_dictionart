// Generated by data binding compiler. Do not edit!
package com.example.wordbook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.wordbook.R;
import com.example.wordbook.database.Word;
import com.example.wordbook.vocalist.VocaListAdapter;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ViewholderVocaBinding extends ViewDataBinding {
  @NonNull
  public final TextView english;

  @NonNull
  public final TextView means;

  @Bindable
  protected Word mWord;

  @Bindable
  protected VocaListAdapter.VocaClickListener mOnClick;

  protected ViewholderVocaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView english, TextView means) {
    super(_bindingComponent, _root, _localFieldCount);
    this.english = english;
    this.means = means;
  }

  public abstract void setWord(@Nullable Word word);

  @Nullable
  public Word getWord() {
    return mWord;
  }

  public abstract void setOnClick(@Nullable VocaListAdapter.VocaClickListener onClick);

  @Nullable
  public VocaListAdapter.VocaClickListener getOnClick() {
    return mOnClick;
  }

  @NonNull
  public static ViewholderVocaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.viewholder_voca, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewholderVocaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewholderVocaBinding>inflateInternal(inflater, R.layout.viewholder_voca, root, attachToRoot, component);
  }

  @NonNull
  public static ViewholderVocaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.viewholder_voca, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewholderVocaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewholderVocaBinding>inflateInternal(inflater, R.layout.viewholder_voca, null, false, component);
  }

  public static ViewholderVocaBinding bind(@NonNull View view) {
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
  public static ViewholderVocaBinding bind(@NonNull View view, @Nullable Object component) {
    return (ViewholderVocaBinding)bind(component, view, R.layout.viewholder_voca);
  }
}
