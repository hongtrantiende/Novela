package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xy8  reason: default package */
/* loaded from: classes.dex */
public final class xy8 {
    public final Context a;
    public final vy8 b;
    public final SparseArray c;
    public final boolean d;
    public final wy2 e;
    public final xfb f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final r8d i;
    public cw j = new cw(6, (byte) 0);
    public ggb k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;

    public xy8(sy8 sy8Var) {
        long j;
        this.a = sy8Var.a;
        vy8 vy8Var = sy8Var.c;
        vy8Var.getClass();
        this.b = vy8Var;
        this.c = new SparseArray();
        ms5 ms5Var = qs5.b;
        mm9 mm9Var = mm9.e;
        this.d = sy8Var.d;
        xfb xfbVar = sy8Var.e;
        this.f = xfbVar;
        long j2 = sy8Var.g;
        if (j2 != -9223372036854775807L) {
            j = -j2;
        } else {
            j = -9223372036854775807L;
        }
        this.h = j;
        r8d r8dVar = sy8Var.h;
        this.i = r8dVar;
        this.e = new wy2(sy8Var.b, r8dVar, xfbVar);
        this.g = new CopyOnWriteArraySet();
        new vq4(new uq4());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
    }
}
