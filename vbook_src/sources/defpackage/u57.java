package defpackage;

import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u57  reason: default package */
/* loaded from: classes.dex */
public abstract class u57 {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public u57() {
        this.b = new Object();
        this.c = new t57(this);
        this.d = new WeakReference(null);
    }

    public static void a(r09 r09Var) {
        List list = r09Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((z09) list.get(i)).a();
        }
    }

    public void b(v57 v57Var, Handler handler) {
        long j;
        boolean z;
        boolean z2;
        if (this.a) {
            boolean z3 = false;
            this.a = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompat = v57Var.f;
            if (playbackStateCompat == null) {
                j = 0;
            } else {
                j = playbackStateCompat.e;
            }
            if (playbackStateCompat != null && playbackStateCompat.a == 3) {
                z = true;
            } else {
                z = false;
            }
            if ((516 & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((j & 514) != 0) {
                z3 = true;
            }
            if (z && z3) {
                d();
            } else if (!z && z2) {
                e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.lu4 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.y38
            if (r0 == 0) goto L13
            r0 = r6
            y38 r0 = (defpackage.y38) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            y38 r0 = new y38
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r6)
            goto L4c
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2c:
            defpackage.hre.r(r6)
            r4.a = r3
            c95 r6 = new c95
            r1 = 29
            r6.<init>(r4, r5, r2, r1)
            r0.c = r3
            a9b r5 = new a9b
            d82 r1 = r0.getContext()
            r5.<init>(r0, r1)
            java.lang.Object r5 = defpackage.zbe.J(r5, r3, r5, r6)
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L4c
            return r6
        L4c:
            r5 = 0
            r4.a = r5
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u57.j(lu4, n42):java.lang.Object");
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public u57(t3a t3aVar, lu4 lu4Var, r13 r13Var) {
        this.b = t3aVar;
        this.c = lu4Var;
        this.d = r13Var;
        this.e = new s6f(19);
    }
}
