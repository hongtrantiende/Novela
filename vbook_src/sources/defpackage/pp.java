package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pp  reason: default package */
/* loaded from: classes.dex */
public final class pp extends fb6 implements vt4 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ pv4 c;
    public final /* synthetic */ xx9 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(Context context, xt4 xt4Var, pv4 pv4Var, xx9 xx9Var, int i, View view) {
        super(0);
        this.a = context;
        this.b = xt4Var;
        this.c = pv4Var;
        this.d = xx9Var;
        this.e = i;
        this.f = view;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        View view = this.f;
        view.getClass();
        return new wcd(this.a, this.b, this.c, this.d, this.e, (wg8) view).getLayoutNode();
    }
}
