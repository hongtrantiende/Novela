package defpackage;

import android.util.Pair;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o67  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o67 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r67 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ cs6 d;
    public final /* synthetic */ h57 e;

    public /* synthetic */ o67(r67 r67Var, Pair pair, cs6 cs6Var, h57 h57Var, int i) {
        this.a = i;
        this.b = r67Var;
        this.c = pair;
        this.d = cs6Var;
        this.e = h57Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h57 h57Var = this.e;
        cs6 cs6Var = this.d;
        Pair pair = this.c;
        r67 r67Var = this.b;
        switch (i) {
            case 0:
                ((ms2) r67Var.b.i).j(((Integer) pair.first).intValue(), (e67) pair.second, cs6Var, h57Var);
                return;
            default:
                ((ms2) r67Var.b.i).m(((Integer) pair.first).intValue(), (e67) pair.second, cs6Var, h57Var);
                return;
        }
    }
}
