package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mq  reason: default package */
/* loaded from: classes.dex */
public final class mq implements gl1 {
    public static Drawable b(Drawable drawable) {
        LayerDrawable layerDrawable;
        int numberOfLayers;
        if ((drawable instanceof LayerDrawable) && (numberOfLayers = (layerDrawable = (LayerDrawable) drawable).getNumberOfLayers()) > 0) {
            Drawable drawable2 = layerDrawable.getDrawable(numberOfLayers - 1);
            drawable2.getClass();
            return b(drawable2);
        }
        return drawable;
    }

    @Override // defpackage.gl1
    public final Object a(Context context, io5 io5Var, t8b t8bVar, vk8 vk8Var, m42 m42Var) {
        if ((vk8Var instanceof uk3) && (b(((uk3) vk8Var).f) instanceof Animatable)) {
            return new h7b("Animated images do not support subsampling");
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mq.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return cm9.a(mq.class).hashCode();
    }

    public final String toString() {
        return "AnimatableCoilComposeSubsamplingImageGenerator";
    }
}
