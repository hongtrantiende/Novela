package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ch  reason: default package */
/* loaded from: classes.dex */
public final class ch {
    public static final ch a = new Object();

    public final void a(View view, w09 w09Var) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (w09Var instanceof lk) {
            systemIcon = PointerIcon.getSystemIcon(context, ((lk) w09Var).b);
        } else {
            systemIcon = PointerIcon.getSystemIcon(context, 1000);
        }
        if (!c16.i(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
