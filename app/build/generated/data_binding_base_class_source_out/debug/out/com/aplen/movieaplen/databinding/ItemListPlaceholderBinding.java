// Generated by view binder compiler. Do not edit!
package com.aplen.movieaplen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aplen.movieaplen.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemListPlaceholderBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView imgItemPoster;

  @NonNull
  public final MaterialCardView mcvPoster;

  @NonNull
  public final TextView tvItemOverview;

  @NonNull
  public final TextView tvItemRating;

  @NonNull
  public final TextView tvItemTitle;

  private ItemListPlaceholderBinding(@NonNull MaterialCardView rootView,
      @NonNull ImageView imgItemPoster, @NonNull MaterialCardView mcvPoster,
      @NonNull TextView tvItemOverview, @NonNull TextView tvItemRating,
      @NonNull TextView tvItemTitle) {
    this.rootView = rootView;
    this.imgItemPoster = imgItemPoster;
    this.mcvPoster = mcvPoster;
    this.tvItemOverview = tvItemOverview;
    this.tvItemRating = tvItemRating;
    this.tvItemTitle = tvItemTitle;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemListPlaceholderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemListPlaceholderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_list_placeholder, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemListPlaceholderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_item_poster;
      ImageView imgItemPoster = ViewBindings.findChildViewById(rootView, id);
      if (imgItemPoster == null) {
        break missingId;
      }

      id = R.id.mcv_poster;
      MaterialCardView mcvPoster = ViewBindings.findChildViewById(rootView, id);
      if (mcvPoster == null) {
        break missingId;
      }

      id = R.id.tv_item_overview;
      TextView tvItemOverview = ViewBindings.findChildViewById(rootView, id);
      if (tvItemOverview == null) {
        break missingId;
      }

      id = R.id.tv_item_rating;
      TextView tvItemRating = ViewBindings.findChildViewById(rootView, id);
      if (tvItemRating == null) {
        break missingId;
      }

      id = R.id.tv_item_title;
      TextView tvItemTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvItemTitle == null) {
        break missingId;
      }

      return new ItemListPlaceholderBinding((MaterialCardView) rootView, imgItemPoster, mcvPoster,
          tvItemOverview, tvItemRating, tvItemTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}