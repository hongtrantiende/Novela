package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l97  reason: default package */
/* loaded from: classes.dex */
public final class l97 implements z69, hcd, cf6, av4, dw9, qy, ks, gn9, a2e, p0e, b8e, k6f, qkf, okf {
    public Object a;

    public /* synthetic */ l97(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l2f, java.lang.Object] */
    public static l97 G() {
        Pattern compile = Pattern.compile("[.-]");
        z3f z3fVar = new z3f(compile);
        Matcher matcher = compile.matcher("");
        matcher.getClass();
        if (!matcher.matches()) {
            ?? obj = new Object();
            obj.a = z3fVar;
            return new l97(obj);
        }
        vs.m(hif.z("The pattern may not match the empty string: %s", z3fVar));
        return null;
    }

    @Override // defpackage.hcd
    public int A(View view) {
        return view.getBottom() + ((fl9) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ((fl9) view.getLayoutParams())).bottomMargin;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x014f, code lost:
        if (r4 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015e, code lost:
        if (((java.util.List) defpackage.fca.j(r9, defpackage.mp5.a)).isEmpty() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0160, code lost:
        r8 = new java.util.LinkedHashMap(r0);
        r8.put("coil#size", r11.b.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0175, code lost:
        return new defpackage.h97(r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017b, code lost:
        return new defpackage.h97(r0, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.h97 B(defpackage.jp5 r9, java.lang.Object r10, defpackage.xe8 r11, defpackage.ox9 r12) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l97.B(jp5, java.lang.Object, xe8, ox9):h97");
    }

    public zda C(JSONObject jSONObject) {
        eea fn8Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            fn8Var = new r0f(22);
        } else {
            fn8Var = new fn8(3);
        }
        return fn8Var.b((mp8) this.a, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(defpackage.rl9 r8, defpackage.vf9 r9, defpackage.vf9 r10) {
        /*
            r7 = this;
            java.lang.Object r7 = r7.a
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r0 = 0
            r8.m(r0)
            cl9 r0 = r7.i0
            r1 = r0
            yu2 r1 = (defpackage.yu2) r1
            if (r9 == 0) goto L1f
            r1.getClass()
            int r3 = r9.b
            int r5 = r10.b
            if (r3 != r5) goto L21
            int r0 = r9.c
            int r2 = r10.c
            if (r0 == r2) goto L1f
            goto L21
        L1f:
            r2 = r8
            goto L2b
        L21:
            int r4 = r9.c
            int r6 = r10.c
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L3a
        L2b:
            r1.l(r2)
            android.view.View r8 = r2.a
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.i
            r8.add(r2)
            r8 = 1
        L3a:
            if (r8 == 0) goto L3f
            r7.O()
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l97.D(rl9, vf9, vf9):void");
    }

    public void E(rl9 rl9Var, vf9 vf9Var, vf9 vf9Var2) {
        int i;
        int i2;
        boolean z;
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.c.o(rl9Var);
        recyclerView.e(rl9Var);
        rl9Var.m(false);
        yu2 yu2Var = (yu2) recyclerView.i0;
        yu2Var.getClass();
        int i3 = vf9Var.b;
        int i4 = vf9Var.c;
        View view = rl9Var.a;
        if (vf9Var2 == null) {
            i = view.getLeft();
        } else {
            i = vf9Var2.b;
        }
        int i5 = i;
        if (vf9Var2 == null) {
            i2 = view.getTop();
        } else {
            i2 = vf9Var2.c;
        }
        int i6 = i2;
        if (!rl9Var.g() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            z = yu2Var.g(rl9Var, i3, i4, i5, i6);
        } else {
            yu2Var.l(rl9Var);
            yu2Var.h.add(rl9Var);
            z = true;
        }
        if (z) {
            recyclerView.O();
        }
    }

    public Object F(ta1 ta1Var, vt4 vt4Var) {
        vma vmaVar;
        u8a u8aVar;
        int i;
        if (((c3e) this.a) == null) {
            e39.b("Called runAndWatch on a manager that has been disposed of");
        }
        c3e c3eVar = (c3e) this.a;
        if ((c3eVar instanceof vma) && (u8aVar = (vmaVar = (vma) c3eVar).f) != null && !u8aVar.equals(ta1Var)) {
            au7 au7Var = new au7();
            u8a u8aVar2 = vmaVar.f;
            if (u8aVar2 == null) {
                e39.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            uv7 uv7Var = vmaVar.d;
            ArrayList arrayList = au7Var.c;
            if (uv7Var == null) {
                Object obj = vmaVar.b;
                obj.getClass();
                arrayList.add(new xt7(obj, u8aVar2));
            } else {
                Object[] objArr = uv7Var.b;
                long[] jArr = uv7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new xt7(objArr[(i2 << 3) + i5], u8aVar2));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            au7Var.p();
            vmaVar.s();
            this.a = au7Var;
        }
        c3e c3eVar2 = (c3e) this.a;
        c3eVar2.getClass();
        zqa u = dra.j().u(c3eVar2.F(ta1Var));
        c3eVar2.o(ta1Var);
        try {
            zqa j2 = u.j();
            Object invoke = vt4Var.invoke();
            zqa.q(j2);
            u.c();
            c3eVar2.p();
            return invoke;
        } catch (Throwable th) {
            u.c();
            throw th;
        }
    }

    public List H(String str) {
        str.getClass();
        Iterator c = ((qkf) this.a).c(this, str);
        ArrayList arrayList = new ArrayList();
        while (true) {
            ihf ihfVar = (ihf) c;
            if (ihfVar.hasNext()) {
                arrayList.add((String) ihfVar.next());
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    @Override // defpackage.p0e
    public void a(Status status) {
        p1e p1eVar = (p1e) this.a;
        String str = status.b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null, null, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null, null, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null, null, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null, null, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null, null, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null, null, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null, null, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null, null, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null, null, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null, null, null);
            }
        }
        if (p1eVar.a != 8) {
            aae aaeVar = p1eVar.f;
            if (aaeVar != null) {
                aaeVar.a(status);
            }
            p1eVar.c(status);
            return;
        }
        p1eVar.m = true;
        throw null;
    }

    @Override // defpackage.gn9
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        jvd jvdVar = (jvd) ((lud) obj).l();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(jvdVar.c);
        int i = uud.a;
        obtain.writeInt(1);
        ((kud) this.a).writeToParcel(obtain, 0);
        try {
            jvdVar.b.transact(1, obtain, null, 1);
            obtain.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.k6f
    public void b(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        yze yzeVar = (yze) this.a;
        if (isEmpty) {
            yzeVar.b0("auto", "_err", bundle);
            return;
        }
        yzeVar.getClass();
        vs.k("Unexpected call on client side");
    }

    @Override // defpackage.qkf
    public Iterator c(l97 l97Var, CharSequence charSequence) {
        return new ihf(l97Var, charSequence, (gqe) this.a, 1);
    }

    @Override // defpackage.cf6
    public void d(int i, int i2) {
        qg6 qg6Var = (qg6) this.a;
        if (qg6Var.h.a()) {
            z87.v(((eg6) qg6Var.e.getValue()).h, null, null, new o54(qg6Var, (m42) null, 16), 3);
        }
        qg6Var.m(i, i2, false);
    }

    @Override // defpackage.p0e
    public void e(r4e r4eVar) {
        p1e p1eVar = (p1e) this.a;
        p1eVar.l = r4eVar;
        p1eVar.e();
        am8.u("no success or failure set on method implementation", p1eVar.m);
    }

    @Override // defpackage.p0e
    public void f(p4e p4eVar, x3e x3eVar) {
        boolean z;
        p1e p1eVar = (p1e) this.a;
        int i = p1eVar.a;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        am8.u("Unexpected response type: " + i, z);
        p1eVar.h = p4eVar;
        p1eVar.i = x3eVar;
        p1eVar.e();
        am8.u("no success or failure set on method implementation", p1eVar.m);
    }

    @Override // defpackage.p0e
    public void g(p4e p4eVar) {
        p1e p1eVar = (p1e) this.a;
        int i = p1eVar.a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        am8.u("Unexpected response type: " + i, z);
        p1eVar.h = p4eVar;
        p1eVar.e();
        am8.u("no success or failure set on method implementation", p1eVar.m);
    }

    @Override // defpackage.ks
    public ri4 get(int i) {
        return ((bj4[]) this.a)[i];
    }

    @Override // defpackage.hcd
    public int h(View view) {
        return (view.getTop() - ((fl9) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ((fl9) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.z69
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.cf6
    public Object j(float f, gxa gxaVar, lo9 lo9Var) {
        return jxe.k((qg6) this.a, f, gxaVar, lo9Var);
    }

    @Override // defpackage.a2e
    public /* synthetic */ void k(l1e l1eVar) {
        z3e z3eVar = (z3e) l1eVar;
        ((rwa) this.a).zza();
    }

    @Override // defpackage.z69
    public void l(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.a).setResultCode(i);
    }

    @Override // defpackage.hcd
    public int m() {
        return ((el9) this.a).D();
    }

    @Override // defpackage.cf6
    public bf6 n() {
        return new k57(((qg6) this.a).j(), 6);
    }

    @Override // defpackage.dw9
    public cw9 o(String str) {
        str.getClass();
        return new h9b(((l9b) this.a).k0());
    }

    @Override // defpackage.p0e
    public void p(yb3 yb3Var) {
        p1e p1eVar = (p1e) this.a;
        p1eVar.k = yb3Var;
        p1eVar.c(am8.G("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // defpackage.cf6
    public int q() {
        return ((qg6) this.a).i();
    }

    @Override // defpackage.p0e
    public void r(odd oddVar) {
        Status status = (Status) oddVar.b;
        hde hdeVar = (hde) oddVar.c;
        p1e p1eVar = (p1e) this.a;
        aae aaeVar = p1eVar.f;
        if (aaeVar != null) {
            aaeVar.a(status);
        }
        p1eVar.j = hdeVar;
        aae aaeVar2 = p1eVar.f;
        if (aaeVar2 != null) {
            aaeVar2.a(status);
        }
        p1eVar.c(status);
    }

    @Override // defpackage.av4
    public void s(Throwable th) {
        bx2 bx2Var = ((vp9) this.a).b;
        ((AtomicReference) bx2Var.d).set(th);
        Pair pair = (Pair) ((ArrayBlockingQueue) bx2Var.b).poll();
        if (pair != null) {
            ((gca) pair.second).m(th);
        }
    }

    @Override // defpackage.hcd
    public int t() {
        el9 el9Var = (el9) this.a;
        return el9Var.n - el9Var.A();
    }

    @Override // defpackage.cf6
    public int u() {
        return ((qg6) this.a).h();
    }

    @Override // defpackage.qy
    public Object v(i2a i2aVar, Float f, Float f2, xt4 xt4Var, rqa rqaVar) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object f3 = nae.f(i2aVar, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, yte.a(nae.e, floatValue2, 28), (xr) this.a, xt4Var, rqaVar);
        if (f3 == n82.a) {
            return f3;
        }
        return (ur) f3;
    }

    @Override // defpackage.p0e
    public void w(Status status, ru8 ru8Var) {
        boolean z;
        p1e p1eVar = (p1e) this.a;
        int i = p1eVar.a;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        am8.u("Unexpected response type " + i, z);
        aae aaeVar = p1eVar.f;
        if (aaeVar != null) {
            aaeVar.a(status);
        }
        p1eVar.j = ru8Var;
        aae aaeVar2 = p1eVar.f;
        if (aaeVar2 != null) {
            aaeVar2.a(status);
        }
        p1eVar.c(status);
    }

    public void x(int i, boolean z) {
        ih1 ih1Var = (ih1) this.a;
        if (z) {
            ih1Var.b(i);
        } else {
            ih1Var.getClass();
        }
    }

    @Override // defpackage.hcd
    public View y(int i) {
        return ((el9) this.a).t(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.i97 z(defpackage.jp5 r17, defpackage.h97 r18, defpackage.cna r19, defpackage.hz9 r20) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l97.z(jp5, h97, cna, hz9):i97");
    }

    @Override // defpackage.p0e
    public void zza() {
        boolean z;
        p1e p1eVar = (p1e) this.a;
        int i = p1eVar.a;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        am8.u("Unexpected response type " + i, z);
        p1eVar.e();
        am8.u("no success or failure set on method implementation", p1eVar.m);
    }

    @Override // defpackage.b8e
    public boolean zzb(Class cls) {
        for (b8e b8eVar : (b8e[]) this.a) {
            if (b8eVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.av4
    public void onSuccess(Object obj) {
    }

    @Override // defpackage.b8e
    public n8e zza(Class cls) {
        b8e[] b8eVarArr;
        for (b8e b8eVar : (b8e[]) this.a) {
            if (b8eVar.zzb(cls)) {
                return b8eVar.zza(cls);
            }
        }
        xk5.q("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.a2e
    /* renamed from: zza */
    public void mo0zza(String str) {
        ((rwa) this.a).a(am8.G(str));
    }

    @Override // defpackage.okf
    public Object zza(String str) {
        return ((ukf) this.a).a(str, null);
    }
}
