package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qz3  reason: default package */
/* loaded from: classes.dex */
public final class qz3 {
    public static final int B;
    public static final boolean C;
    public final boolean A;
    public final Context a;
    public final xfb b;
    public final z40 c;
    public final z40 d;
    public c9b e;
    public final z40 f;
    public final Looper g;
    public final int h;
    public final l40 i;
    public final int j;
    public final boolean k;
    public final o4a l;
    public final u3a m;
    public final long n;
    public final long o;
    public final long p;
    public final hv2 q;
    public final long r;
    public final long s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final boolean x;
    public boolean y;
    public final String z;

    static {
        int i;
        String str = a2d.a;
        String B2 = kve.B(Build.DEVICE);
        if (!B2.contains("emulator") && !B2.contains("emu64a") && !B2.contains("emu64x") && !B2.contains("generic")) {
            i = 10000;
        } else {
            i = 30000;
        }
        B = i;
        C = true;
    }

    public qz3(Context context) {
        int i;
        z40 z40Var = new z40(context, 1);
        z40 z40Var2 = new z40(context, 2);
        z40 z40Var3 = new z40(context, 3);
        z40 z40Var4 = new z40(context, 4);
        this.a = context;
        this.c = z40Var;
        this.d = z40Var2;
        this.e = z40Var3;
        this.f = z40Var4;
        String str = a2d.a;
        Looper myLooper = Looper.myLooper();
        this.g = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.i = l40.b;
        this.j = 1;
        this.k = true;
        this.l = o4a.d;
        this.n = 5000L;
        this.o = 15000L;
        this.p = 3000L;
        this.m = u3a.b;
        this.q = new hv2(a2d.Q(20L), a2d.Q(500L));
        this.b = xfb.a;
        this.r = 500L;
        this.s = 2000L;
        this.t = 600000;
        boolean z = C;
        if (z) {
            i = B;
        } else {
            i = Integer.MAX_VALUE;
        }
        this.u = i;
        this.v = z ? 60000 : Integer.MAX_VALUE;
        this.w = 600000;
        this.x = true;
        this.z = "";
        this.h = -1000;
        new zj1();
        this.A = true;
    }
}
