package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k57  reason: default package */
/* loaded from: classes.dex */
public final class k57 implements hcd, bf6, mm1, na4, pf2, a8b, dyc, xgd, un5, ph0, gn9, z1e, OnFailureListener {
    public final /* synthetic */ int a;
    public Object b;

    public k57(int i) {
        Object v28Var;
        this.a = i;
        switch (i) {
            case 2:
                if (Build.VERSION.SDK_INT >= 28) {
                    v28Var = new Object();
                } else {
                    v28Var = new v28(1);
                }
                this.b = v28Var;
                return;
            case 10:
                this.b = new abf(22);
                return;
            case 27:
                this.b = new ArrayDeque(16);
                return;
            default:
                this.b = new Bundle();
                return;
        }
    }

    public static void G(k57 k57Var, x5e x5eVar, rwa rwaVar, a2e a2eVar) {
        Status G;
        if (!x5eVar.a && TextUtils.isEmpty(x5eVar.H)) {
            k57Var.J(new p4e(x5eVar.c, x5eVar.b, Long.valueOf(x5eVar.d), "Bearer"), x5eVar.C, x5eVar.f, Boolean.valueOf(x5eVar.D), x5eVar.a(), rwaVar, a2eVar);
            return;
        }
        hde a = x5eVar.a();
        String str = x5eVar.e;
        String str2 = x5eVar.J;
        if (x5eVar.a) {
            G = new Status(17012, null, null, null);
        } else {
            G = am8.G(x5eVar.H);
        }
        rwaVar.r(new odd(G, a, str, str2, 4));
    }

    @Override // defpackage.hcd
    public int A(View view) {
        return view.getRight() + ((fl9) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ((fl9) view.getLayoutParams())).rightMargin;
    }

    @Override // defpackage.pf2
    public long B(long j) {
        return 1L;
    }

    @Override // defpackage.pf2
    public long C(long j, long j2) {
        return 1L;
    }

    @Override // defpackage.bf6
    public ArrayList D() {
        List<fg6> list = ((eg6) this.b).m;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (fg6 fg6Var : list) {
            arrayList.add(new po9(fg6Var));
        }
        return arrayList;
    }

    public nj9 E() {
        pa3 C;
        o40 o40Var = (o40) this.b;
        ra3 ra3Var = (ra3) o40Var.d;
        synchronized (ra3Var.D) {
            o40Var.b(true);
            C = ra3Var.C(((oa3) o40Var.b).a);
        }
        if (C != null) {
            return new nj9(C);
        }
        return null;
    }

    public void F(String str, String str2) {
        yz yzVar = MediaMetadataCompat.c;
        if (yzVar.containsKey(str) && ((Integer) yzVar.get(str)).intValue() != 1) {
            vs.m(hl5.n("The ", str, " key cannot be used to put a String"));
        } else {
            ((Bundle) this.b).putCharSequence(str, str2);
        }
    }

    public void H(String str, a2e a2eVar) {
        am8.p(str);
        p4e c = p4e.c(str);
        if (c.zzg()) {
            a2eVar.k(c);
            return;
        }
        lie lieVar = new lie(c.a, 6);
        qu1 qu1Var = (qu1) this.b;
        xk9 xk9Var = new xk9(18, this, a2eVar);
        h1e h1eVar = (h1e) qu1Var.c;
        ch0.w(h1eVar.f("/token", (String) qu1Var.f), lieVar, xk9Var, new p4e(), (bm1) h1eVar.c);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l1e, java.lang.Object] */
    public void I(b3e b3eVar, rwa rwaVar) {
        qu1 qu1Var = (qu1) this.b;
        pxd pxdVar = new pxd(this, rwaVar, 1);
        qu1Var.getClass();
        h1e h1eVar = (h1e) qu1Var.a;
        ch0.w(h1eVar.f("/emailLinkSignin", (String) qu1Var.f), b3eVar, pxdVar, new Object(), (bm1) h1eVar.c);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [l1e, java.lang.Object] */
    public void J(p4e p4eVar, String str, String str2, Boolean bool, hde hdeVar, rwa rwaVar, a2e a2eVar) {
        fje fjeVar = new fje(p4eVar.b, 6);
        qu1 qu1Var = (qu1) this.b;
        oe4 oe4Var = new oe4(this, a2eVar, str2, str, bool, hdeVar, rwaVar, p4eVar);
        h1e h1eVar = (h1e) qu1Var.a;
        ch0.w(h1eVar.f("/getAccountInfo", (String) qu1Var.f), fjeVar, oe4Var, new Object(), (bm1) h1eVar.c);
    }

    public boolean K() {
        ppe ppeVar = ((lte) this.b).f;
        lte.m(ppeVar);
        return Log.isLoggable(ppeVar.h0(), 3);
    }

    public void L() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long O = O();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + O);
    }

    public void M(int i, Object obj, o8e o8eVar) {
        i6e i6eVar = (i6e) obj;
        e7e e7eVar = (e7e) this.b;
        e7eVar.p(i, 2);
        e7eVar.o(i6eVar.a(o8eVar));
        o8eVar.e(i6eVar, this);
    }

    public void N(long j) {
        long O = O();
        if (O != j) {
            if (O != -1) {
                if (O == -2) {
                    O = -2;
                } else {
                    return;
                }
            }
            StringBuilder o = rs8.o(j, "expected non-string scope or scope ", " but found ");
            o.append(O);
            throw new IOException(o.toString());
        }
    }

    public long O() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // defpackage.ph0
    public void a(jz1 jz1Var) {
        ((xz4) this.b).a(jz1Var);
    }

    @Override // defpackage.gn9
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 19:
                uvd uvdVar = new uvd(2, (TaskCompletionSource) obj2);
                xwd xwdVar = (xwd) ((wvd) obj).l();
                Parcel e = xwdVar.e();
                int i = bwd.a;
                e.writeStrongBinder(uvdVar);
                bwd.c(e, (zx4) this.b);
                xwdVar.f(e, 3);
                return;
            default:
                uye uyeVar = (uye) ((wye) obj).l();
                ixe ixeVar = new ixe((iye) this.b, (TaskCompletionSource) obj2);
                Parcel S = uyeVar.S();
                wbe.c(S, ixeVar);
                uyeVar.T(S, 27);
                return;
        }
    }

    @Override // defpackage.pf2
    public long b(long j) {
        return 0L;
    }

    @Override // defpackage.mm1
    public long d() {
        return ((ut9) this.b).c;
    }

    @Override // defpackage.bf6
    public boolean e() {
        ((eg6) this.b).getClass();
        return false;
    }

    @Override // defpackage.bf6
    public int f() {
        return dce.v(this);
    }

    @Override // defpackage.pf2
    public long g(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.k99
    public Object get() {
        return new uba((eha) ((j99) this.b).get());
    }

    @Override // defpackage.xgd
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) st0.e(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // defpackage.xgd
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) st0.e(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getWebkitToCompatConverter());
    }

    @Override // defpackage.hcd
    public int h(View view) {
        return (view.getLeft() - ((fl9) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ((fl9) view.getLayoutParams())).leftMargin;
    }

    @Override // defpackage.bf6
    public r1a i(rl1 rl1Var) {
        return dce.x(this, rl1Var);
    }

    @Override // defpackage.bf6
    public long j() {
        return ((eg6) this.b).i();
    }

    @Override // defpackage.pf2
    public long k(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.pf2
    public zg9 l(long j) {
        return (zg9) this.b;
    }

    @Override // defpackage.hcd
    public int m() {
        return ((el9) this.b).B();
    }

    @Override // defpackage.bf6
    public r1a n(d0 d0Var) {
        return dce.w(this, d0Var);
    }

    @Override // defpackage.bf6
    public ff8 o() {
        return ((eg6) this.b).q;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        jz1 jz1Var;
        if ((exc instanceof fv) && (jz1Var = ((fv) exc).getStatus().d) != null && jz1Var.b == 24) {
            ((AtomicLong) ((kw5) this.b).c).set(SystemClock.elapsedRealtime());
        }
    }

    @Override // defpackage.dyc
    public FileChannel p() {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.b;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        vs.m("Not a file: ".concat(String.valueOf(parcelFileDescriptor)));
        return null;
    }

    @Override // defpackage.bf6
    public ArrayList q(rl1 rl1Var) {
        return dce.t(this, rl1Var);
    }

    @Override // defpackage.pf2
    public long r(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.xgd
    public String[] s() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // defpackage.hcd
    public int t() {
        el9 el9Var = (el9) this.b;
        return el9Var.m - el9Var.C();
    }

    @Override // defpackage.bf6
    public List u(d0 d0Var) {
        return dce.u(this, d0Var);
    }

    @Override // defpackage.bf6
    public int v() {
        return -((eg6) this.b).n;
    }

    @Override // defpackage.pf2
    public boolean w() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v6, types: [byte[], java.io.Serializable] */
    @Override // defpackage.un5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable x(defpackage.xq5 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.crd
            if (r0 == 0) goto L13
            r0 = r6
            crd r0 = (defpackage.crd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crd r0 = new crd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.hre.r(r6)
            goto L4f
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2c:
            defpackage.hre.r(r6)
            r5.getClass()
            java.lang.String r5 = r5.b
            java.lang.String r6 = ":"
            java.lang.String r5 = defpackage.k4b.F0(r5, r6, r5)
            java.lang.Object r4 = r4.b
            erd r4 = (defpackage.erd) r4
            cq5 r4 = r4.J
            if (r4 == 0) goto L54
            r0.c = r2
            ls3 r6 = defpackage.ls3.a
            java.lang.Object r6 = r4.s(r5, r6, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L4f
            return r4
        L4f:
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L54
            return r6
        L54:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k57.x(xq5, n42):java.io.Serializable");
    }

    @Override // defpackage.hcd
    public View y(int i) {
        return ((el9) this.b).t(i);
    }

    @Override // defpackage.pf2
    public long z() {
        return 0L;
    }

    @Override // defpackage.z1e
    public boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((z1e[]) this.b)[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.z1e
    public k2e zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            z1e z1eVar = ((z1e[]) this.b)[i];
            if (z1eVar.zzb(cls)) {
                return z1eVar.zzc(cls);
            }
        }
        xk5.q("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.pf2
    public long c(long j, long j2) {
        return j2;
    }

    public /* synthetic */ k57(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ k57(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public k57(AppMeasurementSdk appMeasurementSdk, s6f s6fVar) {
        this.a = 26;
        this.b = s6fVar;
        appMeasurementSdk.a(new jge(this, 1));
    }

    public k57(ArrayList arrayList) {
        this.a = 22;
        this.b = Collections.unmodifiableList(arrayList);
    }

    public k57(e7e e7eVar) {
        this.a = 23;
        byte[] bArr = n7e.a;
        if (e7eVar != null) {
            this.b = e7eVar;
            e7eVar.a = this;
            return;
        }
        xk5.k("output");
        throw null;
    }

    public k57(Locale locale, CharSequence charSequence) {
        this.a = 16;
        charSequence.getClass();
        this.b = new mld(charSequence, charSequence.length(), locale, 0);
    }

    public /* synthetic */ k57(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }
}
