package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i67  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i67 implements h12 {
    public final /* synthetic */ cl3 a;
    public final /* synthetic */ cs6 b;
    public final /* synthetic */ h57 c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ i67(cl3 cl3Var, cs6 cs6Var, h57 h57Var, IOException iOException, boolean z) {
        this.a = cl3Var;
        this.b = cs6Var;
        this.c = h57Var;
        this.d = iOException;
        this.e = z;
    }

    @Override // defpackage.h12
    public final void accept(Object obj) {
        k67 k67Var = (k67) obj;
        cl3 cl3Var = this.a;
        k67Var.o(cl3Var.a, cl3Var.b, this.b, this.c, this.d, this.e);
    }
}
