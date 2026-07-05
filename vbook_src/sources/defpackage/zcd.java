package defpackage;

import android.view.ViewParent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zcd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zcd extends xu4 implements xt4 {
    public static final zcd a = new xu4(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        ViewParent viewParent = (ViewParent) obj;
        viewParent.getClass();
        return viewParent.getParent();
    }
}
