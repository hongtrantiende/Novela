package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kk9  reason: default package */
/* loaded from: classes.dex */
public final class kk9 extends px1 {
    public static final cza A = dza.a(gu8.d);
    public static final AtomicReference B = new AtomicReference(Boolean.FALSE);
    public long a;
    public final vo b;
    public final zg4 c;
    public final Object d;
    public w26 e;
    public Throwable f;
    public final ArrayList g;
    public List h;
    public uv7 i;
    public final gw7 j;
    public final ArrayList k;
    public final ArrayList l;
    public final tv7 m;
    public final eb5 n;
    public final tv7 o;
    public final tv7 p;
    public ArrayList q;
    public uv7 r;
    public f61 s;
    public final cza t;
    public boolean u;
    public final cza v;
    public final yx9 w;
    public final y26 x;
    public final d82 y;
    public final u28 z;

    public kk9(d82 d82Var) {
        vo voVar = new vo(new gk9(this, 0));
        this.b = voVar;
        this.c = new zg4(new gk9(this, 1));
        this.d = new Object();
        this.g = new ArrayList();
        this.i = new uv7();
        this.j = new gw7(new ux1[16], 0);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new tv7();
        this.n = new eb5(11);
        this.o = new tv7();
        this.p = new tv7();
        this.t = dza.a(null);
        this.v = dza.a(ik9.c);
        this.w = new yx9(5, (byte) 0);
        y26 y26Var = new y26((w26) d82Var.get(r0f.I));
        y26Var.invokeOnCompletion(new cl7(this, 24));
        this.x = y26Var;
        this.y = d82Var.plus(voVar).plus(y26Var);
        this.z = new u28(2);
    }

    public static final void B(kk9 kk9Var, ls7 ls7Var, ls7 ls7Var2) {
        List list = ls7Var2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ls7 ls7Var3 = (ls7) list.get(i);
                eb5 eb5Var = kk9Var.n;
                js7 js7Var = ls7Var3.a;
                bu7.a((tv7) eb5Var.b, js7Var, new r08(ls7Var3, ls7Var));
                bu7.a((tv7) eb5Var.c, ls7Var, js7Var);
                B(kk9Var, ls7Var, ls7Var3);
            }
        }
    }

    public static final void K(ArrayList arrayList, kk9 kk9Var, ux1 ux1Var) {
        arrayList.clear();
        synchronized (kk9Var.d) {
            Iterator it = kk9Var.l.iterator();
            while (it.hasNext()) {
                ls7 ls7Var = (ls7) it.next();
                if (ls7Var.c.equals(ux1Var)) {
                    arrayList.add(ls7Var);
                    it.remove();
                }
            }
        }
    }

    public static void z(yv7 yv7Var) {
        try {
            if (!(yv7Var.w() instanceof ara)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
        } finally {
            yv7Var.c();
        }
    }

    public final void A() {
        synchronized (this.d) {
            if (((ik9) this.v.getValue()).compareTo(ik9.e) >= 0) {
                cza czaVar = this.v;
                ik9 ik9Var = ik9.b;
                czaVar.getClass();
                czaVar.n(null, ik9Var);
            }
        }
        this.x.cancel(null);
    }

    public final e61 C() {
        cza czaVar = this.v;
        int compareTo = ((ik9) czaVar.getValue()).compareTo(ik9.b);
        cza czaVar2 = this.t;
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.k;
        gw7 gw7Var = this.j;
        if (compareTo <= 0) {
            List H = H();
            int size = H.size();
            for (int i = 0; i < size; i++) {
                ux1 ux1Var = (ux1) H.get(i);
            }
            this.g.clear();
            this.h = ks3.a;
            this.i = new uv7();
            gw7Var.g();
            arrayList2.clear();
            arrayList.clear();
            this.q = null;
            f61 f61Var = this.s;
            if (f61Var != null) {
                f61Var.a(null);
            }
            this.s = null;
            czaVar2.m(null);
            return null;
        }
        Object value = czaVar2.getValue();
        ik9 ik9Var = ik9.f;
        ik9 ik9Var2 = ik9.c;
        if (value == null) {
            if (this.e == null) {
                this.i = new uv7();
                gw7Var.g();
                if (D() || F()) {
                    ik9Var2 = ik9.d;
                }
            } else {
                ik9Var2 = (gw7Var.c != 0 || this.i.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || D() || F() || this.m.j()) ? ik9Var : ik9.e;
            }
        }
        czaVar.getClass();
        czaVar.n(null, ik9Var2);
        if (ik9Var2 != ik9Var) {
            return null;
        }
        f61 f61Var2 = this.s;
        this.s = null;
        return f61Var2;
    }

    public final boolean D() {
        if (!this.u && (((z30) ((bm1) this.b.c).d).get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        if (this.j.c == 0 && !D() && !F() && !this.m.j()) {
            return false;
        }
        return true;
    }

    public final boolean F() {
        if (!this.u && (((z30) ((bm1) this.c.c).d).get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        boolean z;
        synchronized (this.d) {
            if (!this.i.h() && this.j.c == 0 && !D()) {
                if (!F()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final List H() {
        List arrayList;
        List list = this.h;
        if (list != null) {
            return list;
        }
        ArrayList arrayList2 = this.g;
        if (arrayList2.isEmpty()) {
            arrayList = ks3.a;
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        this.h = arrayList;
        return arrayList;
    }

    public final void I() {
        e61 C;
        synchronized (this.d) {
            C = C();
            if (((ik9) this.v.getValue()).compareTo(ik9.b) <= 0) {
                throw nye.b("Recomposer shutdown; frame clock awaiter will never resume", this.f);
            }
        }
        if (C != null) {
            ((f61) C).resumeWith(pvc.a);
        }
    }

    public final void J(ux1 ux1Var) {
        synchronized (this.d) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ls7) arrayList.get(i)).c.equals(ux1Var)) {
                    ArrayList arrayList2 = new ArrayList();
                    K(arrayList2, this, ux1Var);
                    while (!arrayList2.isEmpty()) {
                        L(arrayList2, null);
                        K(arrayList2, this, ux1Var);
                    }
                    return;
                }
            }
        }
    }

    public final List L(List list, uv7 uv7Var) {
        yv7 yv7Var;
        yv7 C;
        ArrayList arrayList;
        ls7 ls7Var;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ux1 ux1Var = ((ls7) obj).c;
            Object obj2 = hashMap.get(ux1Var);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(ux1Var, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ux1 ux1Var2 = (ux1) entry.getKey();
            List list2 = (List) entry.getValue();
            if (ux1Var2.R.F) {
                ex1.a("Check failed");
            }
            cl7 cl7Var = new cl7(ux1Var2, 23);
            fl7 fl7Var = new fl7(26, ux1Var2, uv7Var);
            zqa j = dra.j();
            if (j instanceof yv7) {
                yv7Var = (yv7) j;
            } else {
                yv7Var = null;
            }
            if (yv7Var != null && (C = yv7Var.C(cl7Var, fl7Var)) != null) {
                try {
                    zqa j2 = C.j();
                    synchronized (this.d) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ls7 ls7Var2 = (ls7) list2.get(i2);
                            Object b = bu7.b(this.m, ls7Var2.a);
                            ls7 ls7Var3 = (ls7) b;
                            if (ls7Var3 != null) {
                                this.n.v(ls7Var3);
                            }
                            arrayList.add(new yk8(ls7Var2, b));
                        }
                        int size3 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                break;
                            }
                            yk8 yk8Var = (yk8) arrayList.get(i3);
                            if (yk8Var.b == null) {
                                if (((tv7) this.n.b).b(((ls7) yk8Var.a).a)) {
                                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                                    int size4 = arrayList.size();
                                    for (int i4 = 0; i4 < size4; i4++) {
                                        yk8 yk8Var2 = (yk8) arrayList.get(i4);
                                        if (yk8Var2.b == null) {
                                            eb5 eb5Var = this.n;
                                            js7 js7Var = ((ls7) yk8Var2.a).a;
                                            tv7 tv7Var = (tv7) eb5Var.b;
                                            r08 r08Var = (r08) bu7.b(tv7Var, js7Var);
                                            if (tv7Var.i()) {
                                                ((tv7) eb5Var.c).a();
                                            }
                                            if (r08Var != null) {
                                                ls7 ls7Var4 = r08Var.a;
                                                bu7.a(this.p, r08Var.b, ls7Var4);
                                                yk8Var2 = new yk8(yk8Var2.a, ls7Var4);
                                            }
                                        }
                                        arrayList2.add(yk8Var2);
                                    }
                                    arrayList = arrayList2;
                                }
                            }
                            i3++;
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        } else if (((yk8) arrayList.get(i5)).b == null) {
                            i5++;
                        } else {
                            int size6 = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size6) {
                                    break;
                                } else if (((yk8) arrayList.get(i6)).b != null) {
                                    i6++;
                                } else {
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        yk8 yk8Var3 = (yk8) arrayList.get(i7);
                                        if (yk8Var3.b == null) {
                                            ls7Var = (ls7) yk8Var3.a;
                                        } else {
                                            ls7Var = null;
                                        }
                                        if (ls7Var != null) {
                                            arrayList3.add(ls7Var);
                                        }
                                    }
                                    synchronized (this.d) {
                                        xl1.P(this.l, arrayList3);
                                    }
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj3 = arrayList.get(i8);
                                        if (((yk8) obj3).b != null) {
                                            arrayList4.add(obj3);
                                        }
                                    }
                                    arrayList = arrayList4;
                                }
                            }
                        }
                    }
                    ux1Var2.u(arrayList);
                    zqa.q(j2);
                } finally {
                    z(C);
                }
            } else {
                vs.k("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
        }
        return sl1.C0(hashMap.keySet());
    }

    public final ux1 M(ux1 ux1Var, uv7 uv7Var) {
        uv7 uv7Var2;
        yv7 yv7Var;
        yv7 C;
        if (!ux1Var.R.F && !ux1Var.x() && ((uv7Var2 = this.r) == null || !uv7Var2.c(ux1Var))) {
            cl7 cl7Var = new cl7(ux1Var, 23);
            fl7 fl7Var = new fl7(26, ux1Var, uv7Var);
            zqa j = dra.j();
            if (j instanceof yv7) {
                yv7Var = (yv7) j;
            } else {
                yv7Var = null;
            }
            if (yv7Var != null && (C = yv7Var.C(cl7Var, fl7Var)) != null) {
                try {
                    zqa j2 = C.j();
                    if (uv7Var != null && uv7Var.h()) {
                        mm7 mm7Var = new mm7(19, uv7Var, ux1Var);
                        rv4 rv4Var = ux1Var.R;
                        if (rv4Var.F) {
                            ex1.a("Preparing a composition while composing is not supported");
                        }
                        rv4Var.F = true;
                        try {
                            mm7Var.invoke();
                            rv4Var.F = false;
                        } catch (Throwable th) {
                            rv4Var.F = false;
                            throw th;
                        }
                    }
                    boolean z = ux1Var.z();
                    zqa.q(j2);
                    if (z) {
                        return ux1Var;
                    }
                } finally {
                    z(C);
                }
            } else {
                vs.k("Cannot create a mutable snapshot of an read-only snapshot");
            }
        }
        return null;
    }

    public final void N(Throwable th, ux1 ux1Var) {
        if (((Boolean) B.get()).booleanValue() && !(th instanceof hw1)) {
            synchronized (this.d) {
                try {
                    Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                    this.k.clear();
                    this.j.g();
                    this.i = new uv7();
                    this.l.clear();
                    this.m.a();
                    this.o.a();
                    cza czaVar = this.t;
                    hk9 hk9Var = new hk9(th);
                    czaVar.getClass();
                    czaVar.n(null, hk9Var);
                    if (ux1Var != null) {
                        P(ux1Var);
                    }
                    if (C() != null) {
                        ex1.a("expected to go to inactive state due to composition error");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.d) {
            Log.e("ComposeInternal", "Error was captured in composition.", th);
            hk9 hk9Var2 = (hk9) this.t.getValue();
            if (hk9Var2 == null) {
                cza czaVar2 = this.t;
                hk9 hk9Var3 = new hk9(th);
                czaVar2.getClass();
                czaVar2.n(null, hk9Var3);
            } else {
                throw hk9Var2.a;
            }
        }
        throw th;
    }

    public final boolean O() {
        boolean E;
        synchronized (this.d) {
            if (this.i.g()) {
                return E();
            }
            List H = H();
            vz9<Object> vz9Var = new vz9(this.i);
            this.i = new uv7();
            try {
                int size = H.size();
                for (int i = 0; i < size; i++) {
                    ((ux1) H.get(i)).A(vz9Var);
                    if (((ik9) this.v.getValue()).compareTo(ik9.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.d) {
                    if (C() == null) {
                        E = E();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                }
                return E;
            } catch (Throwable th) {
                synchronized (this.d) {
                    uv7 uv7Var = this.i;
                    uv7Var.getClass();
                    for (Object obj : vz9Var) {
                        uv7Var.k(obj);
                    }
                    throw th;
                }
            }
        }
    }

    public final void P(ux1 ux1Var) {
        ArrayList arrayList = this.q;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.q = arrayList;
        }
        if (!arrayList.contains(ux1Var)) {
            arrayList.add(ux1Var);
        }
        if (this.g.remove(ux1Var)) {
            this.h = null;
        }
    }

    public final Object Q(aab aabVar) {
        Object E = z87.E(this.b, new lc9(this, new jk9(this, null), cqe.i(aabVar.getContext()), null, 2), aabVar);
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        if (E != n82Var) {
            E = pvcVar;
        }
        if (E == n82Var) {
            return E;
        }
        return pvcVar;
    }

    @Override // defpackage.px1
    public final void a(ux1 ux1Var, lu4 lu4Var) {
        ik9 ik9Var;
        boolean z;
        yv7 yv7Var;
        yv7 C;
        boolean z2 = ux1Var.R.F;
        synchronized (this.d) {
            ik9Var = ik9.b;
            z = true;
            if (((ik9) this.v.getValue()).compareTo(ik9Var) > 0) {
                z = true ^ H().contains(ux1Var);
            }
        }
        try {
            cl7 cl7Var = new cl7(ux1Var, 23);
            fl7 fl7Var = new fl7(26, ux1Var, null);
            zqa j = dra.j();
            if (j instanceof yv7) {
                yv7Var = (yv7) j;
            } else {
                yv7Var = null;
            }
            if (yv7Var != null && (C = yv7Var.C(cl7Var, fl7Var)) != null) {
                zqa j2 = C.j();
                try {
                    ux1Var.n(lu4Var);
                    z(C);
                    synchronized (this.d) {
                        if (((ik9) this.v.getValue()).compareTo(ik9Var) > 0 && !H().contains(ux1Var)) {
                            this.g.add(ux1Var);
                            this.h = null;
                        }
                    }
                    if (!z2) {
                        dra.j().m();
                    }
                    try {
                        J(ux1Var);
                        try {
                            ux1Var.h();
                            ux1Var.j();
                            if (!z2) {
                                dra.j().m();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            N(th, null);
                            return;
                        }
                    } catch (Throwable th2) {
                        N(th2, ux1Var);
                        return;
                    }
                } finally {
                    zqa.q(j2);
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        } catch (Throwable th3) {
            if (z) {
                synchronized (this.d) {
                }
            }
            N(th3, ux1Var);
        }
    }

    @Override // defpackage.px1
    public final uv7 b(ux1 ux1Var, rka rkaVar, lu4 lu4Var) {
        yx9 yx9Var = this.w;
        try {
            rka rkaVar2 = ux1Var.L;
            ux1Var.L = rkaVar;
            a(ux1Var, lu4Var);
            uv7 uv7Var = (uv7) yx9Var.get();
            if (uv7Var == null) {
                uv7Var = uz9.a;
                uv7Var.getClass();
            }
            ux1Var.L = rkaVar2;
            return uv7Var;
        } finally {
            yx9Var.n(null);
        }
    }

    @Override // defpackage.px1
    public final void c(ls7 ls7Var) {
        e61 C;
        synchronized (this.d) {
            try {
                bu7.a(this.m, ls7Var.a, ls7Var);
                if (ls7Var.h != null) {
                    B(this, ls7Var, ls7Var);
                }
                C = C();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C != null) {
            ((f61) C).resumeWith(pvc.a);
        }
    }

    @Override // defpackage.px1
    public final boolean e() {
        return ((Boolean) B.get()).booleanValue();
    }

    @Override // defpackage.px1
    public final boolean f() {
        return false;
    }

    @Override // defpackage.px1
    public final boolean g() {
        return false;
    }

    @Override // defpackage.px1
    public final long h() {
        return 1000L;
    }

    @Override // defpackage.px1
    public final ox1 i() {
        return null;
    }

    @Override // defpackage.px1
    public final d82 k() {
        return this.y;
    }

    @Override // defpackage.px1
    public final boolean l() {
        return false;
    }

    @Override // defpackage.px1
    public final void m(ls7 ls7Var) {
        e61 C;
        synchronized (this.d) {
            this.l.add(ls7Var);
            C = C();
        }
        if (C != null) {
            ((f61) C).resumeWith(pvc.a);
        }
    }

    @Override // defpackage.px1
    public final void n(ux1 ux1Var) {
        e61 e61Var;
        synchronized (this.d) {
            if (!this.j.h(ux1Var)) {
                this.j.b(ux1Var);
                e61Var = C();
            } else {
                e61Var = null;
            }
        }
        if (e61Var != null) {
            ((f61) e61Var).resumeWith(pvc.a);
        }
    }

    @Override // defpackage.px1
    public final void o(ls7 ls7Var, ks7 ks7Var, ny nyVar) {
        kv7 kv7Var;
        synchronized (this.d) {
            this.o.n(ls7Var, ks7Var);
            Object g = this.p.g(ls7Var);
            if (g == null) {
                kv7Var = i78.b;
                kv7Var.getClass();
            } else if (g instanceof kv7) {
                kv7Var = (kv7) g;
            } else {
                Object[] objArr = i78.a;
                kv7 kv7Var2 = new kv7(1);
                kv7Var2.a(g);
                kv7Var = kv7Var2;
            }
            if (kv7Var.i()) {
                tv7 c = ks7Var.a.c(nyVar, kv7Var);
                Object[] objArr2 = c.b;
                Object[] objArr3 = c.c;
                long[] jArr = c.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    this.o.n((ls7) objArr2[i4], (ks7) objArr3[i4]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
    }

    @Override // defpackage.px1
    public final ks7 p(ls7 ls7Var) {
        ks7 ks7Var;
        synchronized (this.d) {
            ks7Var = (ks7) this.o.l(ls7Var);
        }
        return ks7Var;
    }

    @Override // defpackage.px1
    public final uv7 q(ux1 ux1Var, rka rkaVar, uv7 uv7Var) {
        yx9 yx9Var = this.w;
        try {
            O();
            ux1Var.A(new vz9(uv7Var));
            rka rkaVar2 = ux1Var.L;
            ux1Var.L = rkaVar;
            ux1 M = M(ux1Var, null);
            if (M != null) {
                J(ux1Var);
                M.h();
                M.j();
            }
            uv7 uv7Var2 = (uv7) yx9Var.get();
            if (uv7Var2 == null) {
                uv7Var2 = uz9.a;
                uv7Var2.getClass();
            }
            ux1Var.L = rkaVar2;
            return uv7Var2;
        } finally {
            yx9Var.n(null);
        }
    }

    @Override // defpackage.px1
    public final void t(ek9 ek9Var) {
        yx9 yx9Var = this.w;
        uv7 uv7Var = (uv7) yx9Var.get();
        if (uv7Var == null) {
            uv7 uv7Var2 = uz9.a;
            uv7Var = new uv7();
            yx9Var.n(uv7Var);
        }
        uv7Var.a(ek9Var);
    }

    @Override // defpackage.px1
    public final void u(ux1 ux1Var) {
        synchronized (this.d) {
            try {
                uv7 uv7Var = this.r;
                if (uv7Var == null) {
                    uv7 uv7Var2 = uz9.a;
                    uv7Var = new uv7();
                    this.r = uv7Var;
                }
                uv7Var.a(ux1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [m28, java.lang.Object, te0] */
    @Override // defpackage.px1
    public final h61 v(ik ikVar) {
        zg4 zg4Var = this.c;
        ?? obj = new Object();
        obj.a = ikVar;
        return ((bm1) zg4Var.c).n(obj, (mm7) zg4Var.d);
    }

    @Override // defpackage.px1
    public final void y(ux1 ux1Var) {
        synchronized (this.d) {
            if (this.g.remove(ux1Var)) {
                this.h = null;
            }
            this.j.j(ux1Var);
            this.k.remove(ux1Var);
        }
    }

    @Override // defpackage.px1
    public final void r(Set set) {
    }
}
