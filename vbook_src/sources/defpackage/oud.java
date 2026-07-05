package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oud  reason: default package */
/* loaded from: classes.dex */
public final class oud implements wz4, xz4 {
    public final qz4 b;
    public final jv c;
    public final rwa d;
    public final int l;
    public final xud m;
    public boolean n;
    public final /* synthetic */ yz4 r;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList o = new ArrayList();
    public jz1 p = null;
    public int q = 0;

    public oud(yz4 yz4Var, tz4 tz4Var) {
        this.r = yz4Var;
        Looper looper = yz4Var.J.getLooper();
        ij1 a = tz4Var.a();
        yv yvVar = new yv((String) a.c, (String) a.d, (a00) a.b);
        hud hudVar = (hud) tz4Var.d.a;
        am8.s(hudVar);
        qz4 j = hudVar.j(tz4Var.a, looper, yvVar, tz4Var.e, this, this);
        mu9 mu9Var = tz4Var.c;
        if (mu9Var != null && (j instanceof rh0)) {
            j.t = mu9Var;
        } else {
            String str = tz4Var.b;
            if (str != null && (j instanceof rh0)) {
                j.s = str;
            }
        }
        this.b = j;
        this.c = tz4Var.f;
        this.d = new rwa(13);
        this.l = tz4Var.h;
        if (j.r()) {
            Context context = yz4Var.e;
            ovd ovdVar = yz4Var.J;
            ij1 a2 = tz4Var.a();
            this.m = new xud(context, ovdVar, new yv((String) a2.c, (String) a2.d, (a00) a2.b));
            return;
        }
        this.m = null;
    }

    @Override // defpackage.xz4
    public final void a(jz1 jz1Var) {
        o(jz1Var, null);
    }

    public final void b() {
        qz4 qz4Var = this.b;
        yz4 yz4Var = this.r;
        am8.o(yz4Var.J);
        this.p = null;
        l(jz1.f);
        if (this.n) {
            ovd ovdVar = yz4Var.J;
            jv jvVar = this.c;
            ovdVar.removeMessages(11, jvVar);
            yz4Var.J.removeMessages(9, jvVar);
            this.n = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            o40 o40Var = ((wud) it.next()).a;
            if (m((mb4[]) o40Var.c) != null) {
                it.remove();
            } else {
                try {
                    ((jje) ((vz0) o40Var.d).b).accept(qz4Var, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    e(3);
                    qz4Var.d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        k();
    }

    public final void c(int i) {
        am8.o(this.r.J);
        this.p = null;
        this.n = true;
        String str = this.b.a;
        rwa rwaVar = this.d;
        rwaVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        rwaVar.y(true, new Status(20, sb.toString(), null, null));
        jv jvVar = this.c;
        yz4 yz4Var = this.r;
        ovd ovdVar = yz4Var.J;
        ovdVar.sendMessageDelayed(Message.obtain(ovdVar, 9, jvVar), 5000L);
        ovd ovdVar2 = yz4Var.J;
        ovdVar2.sendMessageDelayed(Message.obtain(ovdVar2, 11, jvVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) yz4Var.C.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        for (wud wudVar : this.f.values()) {
            wudVar.getClass();
        }
    }

    public final boolean d(jz1 jz1Var) {
        synchronized (yz4.N) {
            try {
                yz4 yz4Var = this.r;
                if (yz4Var.G != null && yz4Var.H.contains(this.c)) {
                    jud judVar = yz4Var.G;
                    int i = this.l;
                    judVar.getClass();
                    nvd nvdVar = new nvd(jz1Var, i);
                    AtomicReference atomicReference = judVar.b;
                    while (true) {
                        if (atomicReference.compareAndSet(null, nvdVar)) {
                            judVar.c.post(new bv4(judVar, nvdVar));
                            break;
                        } else if (atomicReference.get() != null) {
                            break;
                        }
                    }
                    yz4Var.f.i(yz4Var.e, jz1Var, true);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wz4
    public final void e(int i) {
        yz4 yz4Var = this.r;
        if (Looper.myLooper() == yz4Var.J.getLooper()) {
            c(i);
            return;
        }
        yz4Var.J.post(new aq3(this, i));
    }

    @Override // defpackage.wz4
    public final void f() {
        yz4 yz4Var = this.r;
        if (Looper.myLooper() == yz4Var.J.getLooper()) {
            b();
            return;
        }
        yz4Var.J.post(new og(this, 11));
    }

    public final void g() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ivd ivdVar = (ivd) arrayList.get(i);
            if (this.b.p()) {
                if (h(ivdVar)) {
                    linkedList.remove(ivdVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean h(ivd ivdVar) {
        if (!(ivdVar instanceof tud)) {
            rwa rwaVar = this.d;
            qz4 qz4Var = this.b;
            ivdVar.c(rwaVar, qz4Var.r());
            try {
                ivdVar.d(this);
                return true;
            } catch (DeadObjectException unused) {
                e(1);
                qz4Var.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        tud tudVar = (tud) ivdVar;
        mb4 m = m(tudVar.f(this));
        if (m == null) {
            rwa rwaVar2 = this.d;
            qz4 qz4Var2 = this.b;
            ivdVar.c(rwaVar2, qz4Var2.r());
            try {
                ivdVar.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                e(1);
                qz4Var2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.b.getClass().getName();
        String str = m.a;
        long c = m.c();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(c).length() + 2);
        nk2.C(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(c);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        yz4 yz4Var = this.r;
        if (yz4Var.K && tudVar.g(this)) {
            int h = tudVar.h(this);
            pud pudVar = new pud(this.c, m);
            ArrayList arrayList = this.o;
            int indexOf = arrayList.indexOf(pudVar);
            if (indexOf >= 0) {
                pud pudVar2 = (pud) arrayList.get(indexOf);
                yz4Var.J.removeMessages(15, pudVar2);
                yz4Var.J.sendMessageDelayed(Message.obtain(yz4Var.J, 15, pudVar2), 5000L);
                return false;
            }
            arrayList.add(pudVar);
            yz4Var.J.sendMessageDelayed(Message.obtain(yz4Var.J, 15, pudVar), 5000L);
            yz4Var.J.sendMessageDelayed(Message.obtain(yz4Var.J, 16, pudVar), 120000L);
            jz1 jz1Var = new jz1(1, 2, null, null, Integer.valueOf(h));
            if (!d(jz1Var)) {
                if (yz4Var.g(jz1Var, this.l)) {
                    String str2 = m.a;
                    long c2 = m.c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 55 + String.valueOf(c2).length());
                    sb2.append("Notification displayed for missing feature: ");
                    sb2.append(str2);
                    sb2.append(", version: ");
                    sb2.append(c2);
                    Log.w("GoogleApiManager", sb2.toString());
                    return false;
                }
                return false;
            }
            String str3 = m.a;
            long c3 = m.c();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 61 + String.valueOf(c3).length());
            sb3.append("A dialog should be displayed for missing feature: ");
            sb3.append(str3);
            sb3.append(", version: ");
            sb3.append(c3);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        tudVar.b(new nxc(m));
        return true;
    }

    public final void i(Status status, Exception exc, boolean z) {
        boolean z2;
        am8.o(this.r.J);
        boolean z3 = true;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc != null) {
            z3 = false;
        }
        if (z2 != z3) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ivd ivdVar = (ivd) it.next();
                if (!z || ivdVar.a == 2) {
                    if (status != null) {
                        ivdVar.a(status);
                    } else {
                        ivdVar.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        vs.m("Status XOR exception should be null");
    }

    public final void j(Status status) {
        am8.o(this.r.J);
        i(status, null, false);
    }

    public final void k() {
        yz4 yz4Var = this.r;
        ovd ovdVar = yz4Var.J;
        jv jvVar = this.c;
        ovdVar.removeMessages(12, jvVar);
        ovd ovdVar2 = yz4Var.J;
        ovdVar2.sendMessageDelayed(ovdVar2.obtainMessage(12, jvVar), yz4Var.a);
    }

    public final void l(jz1 jz1Var) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (hud.l(jz1Var, jz1.f)) {
                    qz4 qz4Var = this.b;
                    if (!qz4Var.p() || qz4Var.b == null) {
                        cy7.e("Failed to connect when checking package");
                        return;
                    }
                }
                throw null;
            }
            vm1.h();
            return;
        }
        hashSet.clear();
    }

    public final mb4 m(mb4[] mb4VarArr) {
        mb4[] mb4VarArr2;
        if (mb4VarArr != null && mb4VarArr.length != 0) {
            fve fveVar = this.b.w;
            if (fveVar == null) {
                mb4VarArr2 = null;
            } else {
                mb4VarArr2 = fveVar.b;
            }
            if (mb4VarArr2 == null) {
                mb4VarArr2 = new mb4[0];
            }
            jla jlaVar = new jla(mb4VarArr2.length);
            for (mb4 mb4Var : mb4VarArr2) {
                jlaVar.put(mb4Var.a, Long.valueOf(mb4Var.c()));
            }
            for (mb4 mb4Var2 : mb4VarArr) {
                Long l = (Long) jlaVar.get(mb4Var2.a);
                if (l == null || l.longValue() < mb4Var2.c()) {
                    return mb4Var2;
                }
            }
        }
        return null;
    }

    public final void n(jz1 jz1Var) {
        am8.o(this.r.J);
        qz4 qz4Var = this.b;
        String name = qz4Var.getClass().getName();
        String valueOf = String.valueOf(jz1Var);
        qz4 qz4Var2 = qz4Var;
        qz4Var2.d(nk2.w(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
        o(jz1Var, null);
    }

    public final void o(jz1 jz1Var, RuntimeException runtimeException) {
        uka ukaVar;
        yz4 yz4Var = this.r;
        am8.o(yz4Var.J);
        xud xudVar = this.m;
        if (xudVar != null && (ukaVar = xudVar.l) != null) {
            ukaVar.c();
        }
        am8.o(this.r.J);
        this.p = null;
        SparseIntArray sparseIntArray = (SparseIntArray) yz4Var.C.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        l(jz1Var);
        if ((this.b instanceof qvd) && jz1Var.b != 24) {
            yz4Var.b = true;
            ovd ovdVar = yz4Var.J;
            ovdVar.sendMessageDelayed(ovdVar.obtainMessage(19), 300000L);
        }
        int i = jz1Var.b;
        if (i == 4) {
            j(yz4.M);
        } else if (i == 25) {
            j(yz4.c(this.c, jz1Var));
        } else {
            LinkedList linkedList = this.a;
            if (linkedList.isEmpty()) {
                this.p = jz1Var;
            } else if (runtimeException != null) {
                am8.o(yz4Var.J);
                i(null, runtimeException, false);
            } else {
                boolean z = yz4Var.K;
                jv jvVar = this.c;
                if (z) {
                    i(yz4.c(jvVar, jz1Var), null, true);
                    if (!linkedList.isEmpty() && !d(jz1Var) && !yz4Var.g(jz1Var, this.l)) {
                        if (jz1Var.b == 18) {
                            this.n = true;
                        }
                        if (this.n) {
                            ovd ovdVar2 = yz4Var.J;
                            ovdVar2.sendMessageDelayed(Message.obtain(ovdVar2, 9, jvVar), 5000L);
                            return;
                        }
                        j(yz4.c(jvVar, jz1Var));
                        return;
                    }
                    return;
                }
                j(yz4.c(jvVar, jz1Var));
            }
        }
    }

    public final void p(ivd ivdVar) {
        am8.o(this.r.J);
        boolean p = this.b.p();
        LinkedList linkedList = this.a;
        if (p) {
            if (h(ivdVar)) {
                k();
                return;
            } else {
                linkedList.add(ivdVar);
                return;
            }
        }
        linkedList.add(ivdVar);
        jz1 jz1Var = this.p;
        if (jz1Var != null && jz1Var.b != 0 && jz1Var.c != null) {
            o(jz1Var, null);
        } else {
            r();
        }
    }

    public final void q() {
        yz4 yz4Var = this.r;
        am8.o(yz4Var.J);
        Status status = yz4.L;
        j(status);
        this.d.y(false, status);
        for (mr6 mr6Var : (mr6[]) this.f.keySet().toArray(new mr6[0])) {
            p(new evd(mr6Var, new TaskCompletionSource()));
        }
        l(new jz1(4, null, null));
        if (this.b.p()) {
            yz4Var.J.post(new og(new g99(this, 14), 12));
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [wf2, qh0, java.lang.Object] */
    public final void r() {
        yz4 yz4Var = this.r;
        am8.o(yz4Var.J);
        qz4 qz4Var = this.b;
        if (!qz4Var.p()) {
            qz4 qz4Var2 = qz4Var;
            if (!qz4Var2.q()) {
                try {
                    int x = yz4Var.C.x(yz4Var.e, qz4Var);
                    if (x != 0) {
                        jz1 jz1Var = new jz1(x, null, null);
                        String name = qz4Var.getClass().getName();
                        String jz1Var2 = jz1Var.toString();
                        StringBuilder sb = new StringBuilder(name.length() + 35 + jz1Var2.length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(jz1Var2);
                        Log.w("GoogleApiManager", sb.toString());
                        o(jz1Var, null);
                        return;
                    }
                    ?? obj = new Object();
                    Objects.requireNonNull(yz4Var);
                    obj.f = yz4Var;
                    obj.d = null;
                    obj.e = null;
                    obj.a = false;
                    obj.b = qz4Var;
                    obj.c = this.c;
                    if (qz4Var.r()) {
                        xud xudVar = this.m;
                        am8.s(xudVar);
                        uka ukaVar = xudVar.l;
                        if (ukaVar != null) {
                            ukaVar.c();
                        }
                        yv yvVar = xudVar.f;
                        yvVar.f = Integer.valueOf(System.identityHashCode(xudVar));
                        hud hudVar = xudVar.d;
                        Context context = xudVar.b;
                        Handler handler = xudVar.c;
                        xudVar.l = (uka) hudVar.j(context, handler.getLooper(), yvVar, (wka) yvVar.e, xudVar, xudVar);
                        xudVar.m = obj;
                        Set set = xudVar.e;
                        if (set != null && !set.isEmpty()) {
                            uka ukaVar2 = xudVar.l;
                            ukaVar2.getClass();
                            ukaVar2.j = new mce((rh0) ukaVar2);
                            ukaVar2.u(2, null);
                        } else {
                            handler.post(new og(xudVar));
                        }
                    }
                    try {
                        qz4Var2.j = obj;
                        qz4Var2.u(2, null);
                    } catch (SecurityException e) {
                        o(new jz1(10, null, null), e);
                    }
                } catch (IllegalStateException e2) {
                    o(new jz1(10, null, null), e2);
                }
            }
        }
    }
}
