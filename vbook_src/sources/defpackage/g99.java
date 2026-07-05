package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Region;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g99  reason: default package */
/* loaded from: classes.dex */
public final class g99 implements bf6, ui4, p9b, OnCompleteListener, ks, vfd, gn9, a2e, x00, tpe {
    public final /* synthetic */ int a;
    public final Object b;

    public g99(Context context) {
        boolean isEmpty;
        this.a = 7;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                }
            }
        }
    }

    public void A() {
        long j;
        f4f f4fVar = (f4f) this.b;
        f4fVar.W();
        lte lteVar = (lte) f4fVar.a;
        dre dreVar = lteVar.e;
        lte.k(dreVar);
        lteVar.G.getClass();
        if (dreVar.g0(System.currentTimeMillis())) {
            dre dreVar2 = lteVar.e;
            lte.k(dreVar2);
            dreVar2.H.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.J.e("Detected application was in foreground");
                long currentTimeMillis = System.currentTimeMillis();
                if (lteVar.d.i0(null, yme.e1)) {
                    j = SystemClock.elapsedRealtime();
                } else {
                    j = 0;
                }
                F(currentTimeMillis, j);
            }
        }
    }

    public void B(long j, long j2) {
        f4f f4fVar = (f4f) this.b;
        f4fVar.W();
        f4fVar.b0();
        lte lteVar = (lte) f4fVar.a;
        dre dreVar = lteVar.e;
        lte.k(dreVar);
        if (dreVar.g0(j)) {
            lte.k(dreVar);
            dreVar.H.b(true);
            lteVar.r().c0();
        }
        lte.k(dreVar);
        dreVar.L.h(j);
        if (dreVar.H.a()) {
            F(j, j2);
        }
    }

    public void C(String str, Bundle bundle) {
        String uri;
        lte lteVar = (lte) this.b;
        ete eteVar = lteVar.C;
        dre dreVar = lteVar.e;
        lte.m(eteVar);
        eteVar.W();
        if (!lteVar.a()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                lte.k(dreVar);
                dreVar.S.l(uri);
                jya jyaVar = dreVar.T;
                lteVar.G.getClass();
                jyaVar.h(System.currentTimeMillis());
            }
        }
    }

    @Override // defpackage.bf6
    public ArrayList D() {
        fj6 fj6Var = (fj6) this.b;
        List<gj6> list = fj6Var.k;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (gj6 gj6Var : list) {
            arrayList.add(new uo9(gj6Var, fj6Var.p));
        }
        return arrayList;
    }

    public void E(dwe dweVar, int i) {
        f8e f8eVar;
        if (i != -30) {
            if (i != -20) {
                if (i != -10) {
                    if (i != 0) {
                        if (i != 30) {
                            f8eVar = f8e.UNSET;
                        } else {
                            f8eVar = f8e.INITIALIZATION;
                        }
                    }
                } else {
                    f8eVar = f8e.MANIFEST;
                }
            }
            f8eVar = f8e.API;
        } else {
            f8eVar = f8e.TCF;
        }
        ((EnumMap) this.b).put((EnumMap) dweVar, (dwe) f8eVar);
    }

    public void F(long j, long j2) {
        f4f f4fVar = (f4f) this.b;
        f4fVar.W();
        lte lteVar = (lte) f4fVar.a;
        if (lteVar.a()) {
            dre dreVar = lteVar.e;
            lte.k(dreVar);
            dreVar.L.h(j);
            lteVar.G.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.J.f(Long.valueOf(elapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long valueOf = Long.valueOf(j3);
            yze yzeVar = lteVar.I;
            lte.l(yzeVar);
            yzeVar.i0(j, valueOf, "auto", "_sid");
            lte.k(dreVar);
            dreVar.M.h(j3);
            dreVar.H.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            lte.l(yzeVar);
            yzeVar.f0(j, j2, bundle, "auto", "_s");
            String k = dreVar.R.k();
            if (!TextUtils.isEmpty(k)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", k);
                lte.l(yzeVar);
                yzeVar.f0(j, j2, bundle2, "auto", "_ssr");
            }
        }
    }

    public void G(dwe dweVar, f8e f8eVar) {
        ((EnumMap) this.b).put((EnumMap) dweVar, (dwe) f8eVar);
    }

    public boolean H() {
        if (I()) {
            lte lteVar = (lte) this.b;
            lteVar.G.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            dre dreVar = lteVar.e;
            lte.k(dreVar);
            if (currentTimeMillis - dreVar.T.g() > lteVar.d.f0(null, yme.i0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean I() {
        dre dreVar = ((lte) this.b).e;
        lte.k(dreVar);
        if (dreVar.T.g() > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tpe
    public /* synthetic */ void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((a6f) this.b).B(str, i, th, bArr, map);
    }

    @Override // defpackage.gn9
    public void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 15:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                kvd kvdVar = (kvd) ((qvd) obj).l();
                elb elbVar = (elb) obj3;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(kvdVar.c);
                int i2 = uud.a;
                if (elbVar == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    elbVar.writeToParcel(obtain, 0);
                }
                try {
                    kvdVar.b.transact(1, obtain, null, 1);
                    obtain.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            default:
                uvd uvdVar = new uvd(3, (TaskCompletionSource) obj2);
                pwd pwdVar = (pwd) ((gwd) obj).l();
                Parcel e = pwdVar.e();
                int i3 = bwd.a;
                e.writeStrongBinder(uvdVar);
                bwd.c(e, (AuthorizationRequest) obj3);
                pwdVar.f(e, 1);
                return;
        }
    }

    @Override // defpackage.vfd
    public void b(String str) {
        lhd lhdVar = (lhd) this.b;
        lhdVar.getClass();
        lhdVar.e.setValue(str);
        vfd vfdVar = lhdVar.k;
        if (vfdVar != null) {
            vfdVar.b(str);
        }
    }

    @Override // defpackage.ui4
    public float c() {
        return nae.e;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [x1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.common.util.concurrent.ListenableFuture, x1, java.lang.Object] */
    @Override // defpackage.x00
    public ListenableFuture call() {
        g0 g0Var;
        int i = this.a;
        e73 e73Var = e73.a;
        Object obj = this.b;
        switch (i) {
            case 22:
                qoc qocVar = new qoc((Callable) obj);
                e73Var.execute(qocVar);
                return qocVar;
            default:
                kn knVar = (kn) obj;
                n9a n9aVar = (n9a) knVar.e;
                try {
                    return dv4.c(knVar.p((Uri) dv4.b((ListenableFuture) knVar.c)));
                } catch (IOException e) {
                    d59 d59Var = (d59) knVar.C;
                    d59Var.getClass();
                    if (!(e instanceof x9f) && !(e.getCause() instanceof x9f)) {
                        ydf ydfVar = (ydf) d59Var.a;
                        ydfVar.getClass();
                        if (!(e.getCause() instanceof i1e)) {
                            ?? obj2 = new Object();
                            obj2.m(e);
                            g0Var = obj2;
                        } else {
                            fs5 c = dv4.c(ydfVar.a);
                            pcf pcfVar = new pcf(knVar, 2);
                            int i2 = khf.a;
                            g0Var = dv4.a(dv4.f(c, new b7f(4, kff.a(), pcfVar), n9aVar), IOException.class, new e5f(e, 5), e73Var);
                        }
                        pcf pcfVar2 = new pcf(knVar, 1);
                        int i3 = khf.a;
                        return dv4.f(g0Var, new b7f(4, kff.a(), pcfVar2), n9aVar);
                    }
                    ?? obj3 = new Object();
                    obj3.m(e);
                    return obj3;
                }
        }
    }

    @Override // defpackage.ui4
    public float d(float f, long j) {
        float f2;
        long j2 = j / 1000000;
        mi4 a = ((ni4) this.b).a(f);
        long j3 = a.c;
        if (j3 > 0) {
            f2 = ((float) j2) / ((float) j3);
        } else {
            f2 = 1.0f;
        }
        return (((Math.signum(a.a) * dj.a(f2).b) * a.b) / ((float) j3)) * 1000.0f;
    }

    @Override // defpackage.bf6
    public boolean e() {
        return ((fj6) this.b).o;
    }

    @Override // defpackage.bf6
    public int f() {
        return dce.v(this);
    }

    @Override // defpackage.vfd
    public ygd g(String str) {
        vfd vfdVar = ((lhd) this.b).k;
        if (vfdVar != null) {
            return vfdVar.g(str);
        }
        return null;
    }

    @Override // defpackage.ks
    public ri4 get(int i) {
        return (bj4) this.b;
    }

    @Override // defpackage.ui4
    public float h(float f, float f2, long j) {
        float f3;
        long j2 = j / 1000000;
        mi4 a = ((ni4) this.b).a(f2);
        long j3 = a.c;
        if (j3 > 0) {
            f3 = ((float) j2) / ((float) j3);
        } else {
            f3 = 1.0f;
        }
        return (Math.signum(a.a) * a.b * dj.a(f3).a) + f;
    }

    @Override // defpackage.bf6
    public r1a i(rl1 rl1Var) {
        return dce.x(this, rl1Var);
    }

    @Override // defpackage.bf6
    public long j() {
        return ((fj6) this.b).i();
    }

    @Override // defpackage.a2e
    public /* synthetic */ void k(l1e l1eVar) {
        ((rwa) this.b).e((r4e) l1eVar);
    }

    @Override // defpackage.vfd
    public void l(int i) {
        lhd lhdVar = (lhd) this.b;
        lhdVar.h.i(i);
        vfd vfdVar = lhdVar.k;
        if (vfdVar != null) {
            vfdVar.l(i);
        }
    }

    @Override // defpackage.p9b
    public String m() {
        return ((q9b) this.b).b;
    }

    @Override // defpackage.bf6
    public r1a n(d0 d0Var) {
        return dce.w(this, d0Var);
    }

    @Override // defpackage.bf6
    public ff8 o() {
        return ((fj6) this.b).p;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        f61 f61Var = (f61) this.b;
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                f61Var.a(null);
                return;
            } else {
                f61Var.resumeWith(task.getResult());
                return;
            }
        }
        f61Var.resumeWith(new gs9(exception));
    }

    @Override // defpackage.ui4
    public long p(float f) {
        return ((long) (Math.exp(((ni4) this.b).b(f) / (oi4.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.bf6
    public ArrayList q(rl1 rl1Var) {
        return dce.t(this, rl1Var);
    }

    @Override // defpackage.p9b
    public void r(o9b o9bVar) {
        q9b q9bVar = (q9b) this.b;
        int length = q9bVar.d.length;
        for (int i = 1; i < length; i++) {
            int i2 = q9bVar.d[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                o9bVar.r(i);
                            }
                        } else {
                            byte[] bArr = q9bVar.D[i];
                            bArr.getClass();
                            o9bVar.p(bArr, i);
                        }
                    } else {
                        String str = q9bVar.C[i];
                        str.getClass();
                        o9bVar.g(i, str);
                    }
                } else {
                    o9bVar.B0(q9bVar.f[i], i);
                }
            } else {
                o9bVar.m(i, q9bVar.e[i]);
            }
        }
    }

    @Override // defpackage.vfd
    public void s(jj jjVar) {
        lhd lhdVar = (lhd) this.b;
        lhdVar.d.setValue(jjVar);
        vfd vfdVar = lhdVar.k;
        if (vfdVar != null) {
            vfdVar.s(jjVar);
        }
    }

    @Override // defpackage.ui4
    public float t(float f, float f2) {
        ni4 ni4Var;
        double b = ((ni4) this.b).b(f2);
        double d = oi4.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * b) * ni4Var.a * ni4Var.b))) + f;
    }

    public String toString() {
        switch (this.a) {
            case 18:
                StringBuilder sb = new StringBuilder("1");
                for (dwe dweVar : dwe.values()) {
                    f8e f8eVar = (f8e) ((EnumMap) this.b).get(dweVar);
                    if (f8eVar == null) {
                        f8eVar = f8e.UNSET;
                    }
                    sb.append(f8eVar.a);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.bf6
    public List u(d0 d0Var) {
        return dce.u(this, d0Var);
    }

    @Override // defpackage.bf6
    public int v() {
        return -((fj6) this.b).l;
    }

    @Override // defpackage.vfd
    public void w(String str, nl5 nl5Var) {
        str.getClass();
        lhd lhdVar = (lhd) this.b;
        lhdVar.g.setValue(Boolean.TRUE);
        lhdVar.f.setValue(str);
        lhdVar.d.setValue(nl5Var);
        z87.C(gs3.a, new jhd(lhdVar, null, 1));
        vfd vfdVar = lhdVar.k;
        if (vfdVar != null) {
            vfdVar.w(str, nl5Var);
        }
    }

    @Override // defpackage.vfd
    public void x(String str) {
        lhd lhdVar = (lhd) this.b;
        lhdVar.g.setValue(Boolean.FALSE);
        lhdVar.h.i(0);
        lhdVar.f.setValue(str);
        z87.C(gs3.a, new jhd(lhdVar, null, 0));
        vfd vfdVar = lhdVar.k;
        if (vfdVar != null) {
            vfdVar.x(str);
        }
    }

    public void y(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.F(childAt);
            yk9 yk9Var = recyclerView.H;
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void z(uy5 uy5Var) {
        ((Region) this.b).set(uy5Var.a, uy5Var.b, uy5Var.c, uy5Var.d);
    }

    @Override // defpackage.a2e
    /* renamed from: zza */
    public void mo0zza(String str) {
        ((rwa) this.b).a(am8.G(str));
    }

    public /* synthetic */ g99(vvd vvdVar, AuthorizationRequest authorizationRequest) {
        this.a = 16;
        this.b = authorizationRequest;
    }

    public g99(k57 k57Var, rwa rwaVar) {
        this.a = 17;
        this.b = rwaVar;
        Objects.requireNonNull(k57Var);
    }

    public g99(EnumMap enumMap) {
        this.a = 18;
        EnumMap enumMap2 = new EnumMap(dwe.class);
        this.b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public g99(un6 un6Var) {
        this.a = 12;
        un6Var.getClass();
        this.b = new WeakReference(un6Var);
    }

    public g99(int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.b = new SparseArray();
                return;
            case 18:
                this.b = new EnumMap(dwe.class);
                return;
            default:
                this.b = new Region();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ni4, java.lang.Object] */
    public g99(r13 r13Var) {
        this.a = 6;
        float f = axa.a;
        ?? obj = new Object();
        obj.a = f;
        float f2 = r13Var.f();
        float f3 = oi4.a;
        obj.b = f2 * 386.0878f * 160.0f * 0.84f;
        this.b = obj;
    }

    public /* synthetic */ g99(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public g99(long[] jArr) {
        bv7 bv7Var;
        this.a = 5;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            bv7Var = new bv7(copyOf.length);
            int i = bv7Var.b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    bv7Var.b(copyOf.length + i);
                    long[] jArr2 = bv7Var.a;
                    int i2 = bv7Var.b;
                    if (i != i2) {
                        b00.Y(jArr2, jArr2, copyOf.length + i, i, i2);
                    }
                    b00.Y(copyOf, jArr2, i, 0, copyOf.length);
                    bv7Var.b += copyOf.length;
                }
            } else {
                cy7.k("");
                throw null;
            }
        } else {
            bv7Var = new bv7();
        }
        this.b = bv7Var;
    }

    public g99(float f, float f2) {
        this.a = 11;
        this.b = new bj4(f, f2, 0.01f);
    }
}
