package defpackage;

import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qkd  reason: default package */
/* loaded from: classes.dex */
public final class qkd implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ kk9 b;

    public qkd(View view, kk9 kk9Var) {
        this.a = view;
        this.b = kk9Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.A();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
