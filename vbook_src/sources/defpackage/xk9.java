package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import okhttp3.Request;
import okhttp3.Response;
import org.chromium.net.UrlResponseInfo;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xk9  reason: default package */
/* loaded from: classes.dex */
public class xk9 implements cf6, oa4, exa, ks, t25, gn9, a2e, Continuation, OnCompleteListener, x00 {
    public final /* synthetic */ int a;
    public Object b;

    public xk9(SideSheetBehavior sideSheetBehavior) {
        this.a = 5;
        this.b = sideSheetBehavior;
        new e09(this, 4);
    }

    public static xk9 s(int i) {
        return new xk9(hlf.a(u6f.a(i)), 26);
    }

    public static xk9 w(String str) {
        yve yveVar;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            yveVar = hwe.e(str.charAt(0));
        } else {
            yveVar = yve.UNINITIALIZED;
        }
        return new xk9(yveVar, 20);
    }

    @Override // defpackage.exa
    public Iterator a(uu5 uu5Var, CharSequence charSequence) {
        return new cxa(this, uu5Var, charSequence, 0);
    }

    @Override // defpackage.gn9
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 16:
                uvd uvdVar = new uvd(0, (TaskCompletionSource) obj2);
                twd twdVar = (twd) ((kwd) obj).l();
                Parcel e = twdVar.e();
                int i = bwd.a;
                e.writeStrongBinder(uvdVar);
                bwd.c(e, (px9) this.b);
                twdVar.f(e, 2);
                return;
            default:
                uke ukeVar = new uke((TaskCompletionSource) obj2);
                l9f l9fVar = (l9f) ((q5f) obj).l();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(l9fVar.b);
                int i2 = mde.a;
                obtain.writeStrongBinder(ukeVar);
                obtain.writeInt(1);
                ((y99) this.b).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    l9fVar.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    @Override // defpackage.t25
    public String b(Object obj) {
        return (String) obj;
    }

    public void c(i7 i7Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i = i7Var.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        return;
                    }
                    recyclerView.I.X(i7Var.b, i7Var.c);
                    return;
                }
                recyclerView.I.Z(i7Var.b, i7Var.c);
                return;
            }
            recyclerView.I.Y(i7Var.b, i7Var.c);
            return;
        }
        recyclerView.I.V(i7Var.b, i7Var.c);
    }

    @Override // defpackage.x00
    public ListenableFuture call() {
        kn knVar = (kn) this.b;
        pcf pcfVar = new pcf(knVar, 3);
        int i = khf.a;
        return dv4.d(dv4.f((ListenableFuture) knVar.c, new b7f(4, kff.a(), pcfVar), (n9a) knVar.e));
    }

    @Override // defpackage.cf6
    public void d(int i, int i2) {
        kj6 kj6Var = (kj6) this.b;
        if (kj6Var.j.a()) {
            z87.v(((fj6) kj6Var.f.getValue()).h, null, null, new se1(kj6Var, null, 1), 3);
        }
        kj6Var.m(i, i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091 A[LOOP:0: B:24:0x008b->B:26:0x0091, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9 A[LOOP:1: B:28:0x00b3->B:30:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb A[LOOP:2: B:32:0x00e5->B:34:0x00eb, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.Object r19, defpackage.n42 r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk9.e(java.lang.Object, n42):java.lang.Object");
    }

    public rl9 f(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int I = recyclerView.f.I();
        int i2 = 0;
        rl9 rl9Var = null;
        while (true) {
            if (i2 >= I) {
                break;
            }
            rl9 F = RecyclerView.F(recyclerView.f.H(i2));
            if (F != null && !F.g() && F.c == i) {
                if (((ArrayList) recyclerView.f.d).contains(F.a)) {
                    rl9Var = F;
                } else {
                    rl9Var = F;
                    break;
                }
            }
            i2++;
        }
        if (rl9Var != null) {
            if (!((ArrayList) recyclerView.f.d).contains(rl9Var.a)) {
                return rl9Var;
            }
        }
        return null;
    }

    public Response g() {
        zg4 zg4Var = (zg4) this.b;
        sr9 sr9Var = ((cq9) zg4Var.d).c;
        Request request = (Request) zg4Var.b;
        w88 w88Var = (w88) zg4Var.c;
        gca gcaVar = w88Var.e;
        ts5 ts5Var = sr9.a;
        try {
            UrlResponseInfo urlResponseInfo = (UrlResponseInfo) bce.p(gcaVar);
            try {
                Response.Builder a = sr9.a(request, urlResponseInfo, (osa) bce.p(w88Var.a));
                List unmodifiableList = Collections.unmodifiableList(w88Var.g);
                List<String> urlChain = urlResponseInfo.getUrlChain();
                if (!unmodifiableList.isEmpty()) {
                    boolean z = true;
                    if (urlChain.size() != unmodifiableList.size() + 1) {
                        z = false;
                    }
                    wq9.r("The number of redirects should be consistent across URLs and headers!", z);
                    Response response = null;
                    for (int i = 0; i < unmodifiableList.size(); i++) {
                        Request.Builder a2 = request.a();
                        a2.c(urlChain.get(i));
                        Response.Builder a3 = sr9.a(new Request(a2), (UrlResponseInfo) unmodifiableList.get(i), null);
                        a3.k = response;
                        response = a3.a();
                    }
                    Request.Builder a4 = request.a();
                    a4.c((String) yf2.t(urlChain));
                    a.a = new Request(a4);
                    a.k = response;
                }
                return a.a();
            } catch (ExecutionException e) {
                throw new IOException(e);
            }
        } catch (ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    @Override // defpackage.k99
    public Object get() {
        return new l0a((Context) ((k99) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(l0a.d).intValue());
    }

    public void h() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void i(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int I = recyclerView.f.I();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < I; i6++) {
            View H = recyclerView.f.H(i6);
            rl9 F = RecyclerView.F(H);
            if (F != null && !F.n() && (i4 = F.c) >= i && i4 < i5) {
                F.a(2);
                F.a(1024);
                ((fl9) H.getLayoutParams()).c = true;
            }
        }
        kl9 kl9Var = recyclerView.c;
        ArrayList arrayList = (ArrayList) kl9Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rl9 rl9Var = (rl9) arrayList.get(size);
            if (rl9Var != null && (i3 = rl9Var.c) >= i && i3 < i5) {
                rl9Var.a(2);
                kl9Var.j(size);
            }
        }
        recyclerView.D0 = true;
    }

    @Override // defpackage.cf6
    public Object j(float f, gxa gxaVar, lo9 lo9Var) {
        return jxe.k((kj6) this.b, f, gxaVar, lo9Var);
    }

    @Override // defpackage.a2e
    public /* synthetic */ void k(l1e l1eVar) {
        ((a2e) this.b).k((p4e) l1eVar);
    }

    @Override // defpackage.t25
    public Iterator l() {
        return ((ArrayList) this.b).iterator();
    }

    public void m(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int I = recyclerView.f.I();
        for (int i3 = 0; i3 < I; i3++) {
            rl9 F = RecyclerView.F(recyclerView.f.H(i3));
            if (F != null && !F.n() && F.c >= i) {
                F.k(i2, false);
                recyclerView.z0.e = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.c.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            rl9 rl9Var = (rl9) arrayList.get(i4);
            if (rl9Var != null && rl9Var.c >= i) {
                rl9Var.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.C0 = true;
    }

    @Override // defpackage.cf6
    public bf6 n() {
        return new g99(((kj6) this.b).j(), 2);
    }

    public void o(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int I = recyclerView.f.I();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < I; i11++) {
            rl9 F = RecyclerView.F(recyclerView.f.H(i11));
            if (F != null && (i9 = F.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    F.k(i2 - i, false);
                } else {
                    F.k(i5, false);
                }
                recyclerView.z0.e = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.c.e;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            rl9 rl9Var = (rl9) arrayList.get(i12);
            if (rl9Var != null && (i8 = rl9Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    rl9Var.k(i2 - i, false);
                } else {
                    rl9Var.k(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.C0 = true;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        fze fzeVar = (fze) this.b;
        if (task.isCanceled()) {
            fzeVar.cancel(false);
        } else if (task.isSuccessful()) {
            fzeVar.l(task.getResult());
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                fzeVar.m(exception);
            } else {
                vm1.d();
            }
        }
    }

    public void p(boolean z) {
        ((WebSettingsBoundaryInterface) this.b).setAlgorithmicDarkeningAllowed(z);
    }

    @Override // defpackage.cf6
    public int q() {
        return ((kj6) this.b).i();
    }

    public void r() {
        View view;
        View view2 = (View) this.b;
        if (view2 != null) {
            if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
                view = view2.getRootView().findFocus();
            } else {
                view2.requestFocus();
                view = view2;
            }
            if (view == null) {
                view = view2.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new e09(view, 5));
            }
        }
    }

    public r3f t(String str, boolean z) {
        return new r3f(str, (k32) this.b, z);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        l0e l0eVar = (l0e) this.b;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            am8.s(exception);
            String message = exception.getMessage();
            Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + message + "\n\n Failing open with a fake token.");
            return l0eVar.C("NO_RECAPTCHA");
        }
        return l0eVar.C((String) task.getResult());
    }

    @Override // defpackage.cf6
    public int u() {
        return ((kj6) this.b).h();
    }

    public void v(int i, String str, List list, boolean z, boolean z2) {
        s56 s56Var;
        lse lseVar = (lse) this.b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        ppe ppeVar = ((lte) lseVar.a).f;
                        lte.m(ppeVar);
                        s56Var = ppeVar.H;
                    } else if (z) {
                        ppe ppeVar2 = ((lte) lseVar.a).f;
                        lte.m(ppeVar2);
                        s56Var = ppeVar2.F;
                    } else if (!z2) {
                        ppe ppeVar3 = ((lte) lseVar.a).f;
                        lte.m(ppeVar3);
                        s56Var = ppeVar3.G;
                    } else {
                        ppe ppeVar4 = ((lte) lseVar.a).f;
                        lte.m(ppeVar4);
                        s56Var = ppeVar4.E;
                    }
                } else {
                    ppe ppeVar5 = ((lte) lseVar.a).f;
                    lte.m(ppeVar5);
                    s56Var = ppeVar5.J;
                }
            } else if (z) {
                ppe ppeVar6 = ((lte) lseVar.a).f;
                lte.m(ppeVar6);
                s56Var = ppeVar6.C;
            } else if (!z2) {
                ppe ppeVar7 = ((lte) lseVar.a).f;
                lte.m(ppeVar7);
                s56Var = ppeVar7.D;
            } else {
                ppe ppeVar8 = ((lte) lseVar.a).f;
                lte.m(ppeVar8);
                s56Var = ppeVar8.f;
            }
        } else {
            ppe ppeVar9 = ((lte) lseVar.a).f;
            lte.m(ppeVar9);
            s56Var = ppeVar9.I;
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    s56Var.e(str);
                    return;
                } else {
                    s56Var.h(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            s56Var.g(list.get(0), list.get(1), str);
            return;
        }
        s56Var.f(list.get(0), str);
    }

    @Override // defpackage.a2e
    /* renamed from: zza */
    public void mo0zza(String str) {
        ((a2e) this.b).mo0zza(str);
    }

    public /* synthetic */ xk9(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    public xk9(vz0 vz0Var, mr6 mr6Var) {
        this.a = 15;
        this.b = vz0Var;
    }

    public /* synthetic */ xk9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ xk9(int i) {
        this.a = i;
    }

    @Override // defpackage.ks
    public ri4 get(int i) {
        return (ri4) this.b;
    }
}
