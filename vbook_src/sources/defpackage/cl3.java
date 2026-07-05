package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cl3  reason: default package */
/* loaded from: classes.dex */
public final class cl3 {
    public final int a;
    public final e67 b;
    public final CopyOnWriteArrayList c;

    public /* synthetic */ cl3(CopyOnWriteArrayList copyOnWriteArrayList, int i, e67 e67Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = e67Var;
    }

    public void a(h12 h12Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j67 j67Var = (j67) it.next();
            a2d.U(j67Var.a, new ex2(16, h12Var, j67Var.b));
        }
    }

    public void b(int i, vq4 vq4Var, int i2, Object obj, long j) {
        a(new iu1(8, this, new h57(1, i, vq4Var, i2, obj, a2d.e0(j), -9223372036854775807L)));
    }

    public void c(cs6 cs6Var, int i, int i2, vq4 vq4Var, int i3, Object obj, long j, long j2) {
        a(new h67(this, cs6Var, new h57(i, i2, vq4Var, i3, obj, a2d.e0(j), a2d.e0(j2)), 1));
    }

    public void d(cs6 cs6Var, int i, int i2, vq4 vq4Var, int i3, Object obj, long j, long j2) {
        a(new h67(this, cs6Var, new h57(i, i2, vq4Var, i3, obj, a2d.e0(j), a2d.e0(j2)), 0));
    }

    public void e(cs6 cs6Var, int i, int i2, vq4 vq4Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        a(new i67(this, cs6Var, new h57(i, i2, vq4Var, i3, obj, a2d.e0(j), a2d.e0(j2)), iOException, z));
    }

    public void f(cs6 cs6Var, int i, IOException iOException, boolean z) {
        e(cs6Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void g(cs6 cs6Var, int i, int i2, vq4 vq4Var, int i3, Object obj, long j, long j2, int i4) {
        a(new g67(this, cs6Var, new h57(i, i2, vq4Var, i3, obj, a2d.e0(j), a2d.e0(j2)), i4));
    }

    public void h(long j, long j2, int i) {
        h57 h57Var = new h57(1, i, null, 3, null, a2d.e0(j), a2d.e0(j2));
        e67 e67Var = this.b;
        e67Var.getClass();
        a(new ua2(5, this, e67Var, h57Var));
    }
}
