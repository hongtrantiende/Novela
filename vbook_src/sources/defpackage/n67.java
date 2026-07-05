package defpackage;

import android.util.Pair;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n67  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n67 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r67 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ h57 d;

    public /* synthetic */ n67(r67 r67Var, Pair pair, h57 h57Var, int i) {
        this.a = i;
        this.b = r67Var;
        this.c = pair;
        this.d = h57Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h57 h57Var = this.d;
        Pair pair = this.c;
        r67 r67Var = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) pair.first).intValue();
                e67 e67Var = (e67) pair.second;
                e67Var.getClass();
                ((ms2) r67Var.b.i).e(intValue, e67Var, h57Var);
                return;
            default:
                ((ms2) r67Var.b.i).d(((Integer) pair.first).intValue(), (e67) pair.second, h57Var);
                return;
        }
    }
}
