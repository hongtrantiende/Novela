package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.reader.android.MainActivity;
import com.vbook.android.R;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Mac;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rwa  reason: default package */
/* loaded from: classes.dex */
public class rwa implements g4a, p0e, OnCompleteListener, Continuation, av4, gn9, f1f {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public rwa(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = Collections.synchronizedMap(new WeakHashMap());
                this.c = Collections.synchronizedMap(new WeakHashMap());
                return;
            case 14:
                uz4 uz4Var = uz4.e;
                this.b = new SparseIntArray();
                this.c = uz4Var;
                return;
            default:
                this.b = new Object();
                wu7 wu7Var = oy5.a;
                this.c = new wu7();
                return;
        }
    }

    public static void c(rwa rwaVar, boolean z, boolean z2) {
        synchronized (rwaVar) {
            boolean z3 = false;
            if (z) {
                if (((PowerManager.WakeLock) rwaVar.c) == null) {
                    if (((Context) rwaVar.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        st0.w("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) rwaVar.b).getSystemService("power");
                    if (powerManager == null) {
                        st0.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    rwaVar.c = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) rwaVar.c;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static final void i(rwa rwaVar) {
        synchronized (rwaVar.b) {
            wu7 wu7Var = (wu7) rwaVar.c;
            long[] jArr = wu7Var.a;
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
                                int i5 = wu7Var.b[i4];
                                o5b o5bVar = (o5b) wu7Var.c[i4];
                                if (o5bVar.c != p5b.e && !o5bVar.b.f()) {
                                    wu7Var.h(i4);
                                }
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

    public static rwa z(bkf bkfVar) {
        int i = x1f.a[bkfVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new rwa(new fje(7, "HmacSha512", false), false, bkf.c, 25);
                }
                throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(bkfVar)));
            }
            return new rwa(new fje(7, "HmacSha384", false), false, bkf.b, 25);
        }
        return new rwa(new fje(7, "HmacSha256", false), false, bkf.a, 25);
    }

    public void A(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) yf2.t(arrayList);
        if (outputStream instanceof haf) {
            this.c = (haf) outputStream;
            this.b = (OutputStream) arrayList.get(0);
        }
    }

    public void B(xgf xgfVar) {
        if (((SharedPreferences.Editor) this.b).putString((String) this.c, lre.o(xgfVar.c())).commit()) {
            return;
        }
        fb4.k("Failed to write to SharedPreferences");
    }

    @Override // defpackage.p0e
    public void a(Status status) {
        try {
            ((p0e) this.b).a(status);
        } catch (RemoteException e) {
            ((kj) this.c).e("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    @Override // defpackage.gn9
    public void accept(Object obj, Object obj2) {
        int i = iye.l;
        ixe ixeVar = new ixe((TaskCompletionSource) obj2);
        uye uyeVar = (uye) ((wye) obj).l();
        Parcel S = uyeVar.S();
        wbe.c(S, ixeVar);
        S.writeString((String) this.b);
        S.writeInt(0);
        S.writeStringArray((String[]) this.c);
        S.writeByteArray(null);
        uyeVar.T(S, 1);
    }

    @Override // defpackage.g4a
    public void b(km8 km8Var) {
        toc tocVar = (toc) this.c;
        SparseArray sparseArray = tocVar.h;
        ea1 ea1Var = (ea1) this.b;
        if (km8Var.z() == 0 && (km8Var.z() & Token.CASE) != 0) {
            km8Var.N(6);
            int a = km8Var.a() / 4;
            for (int i = 0; i < a; i++) {
                km8Var.k(ea1Var.b, 0, 4);
                ea1Var.m(0);
                int g = ea1Var.g(16);
                ea1Var.o(3);
                if (g == 0) {
                    ea1Var.o(13);
                } else {
                    int g2 = ea1Var.g(13);
                    if (sparseArray.get(g2) == null) {
                        sparseArray.put(g2, new h4a(new ljc(tocVar, g2)));
                        tocVar.n++;
                    }
                }
            }
            if (tocVar.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // defpackage.p0e
    public void e(r4e r4eVar) {
        try {
            ((p0e) this.b).e(r4eVar);
        } catch (RemoteException e) {
            ((kj) this.c).e("RemoteException when sending get recaptcha config response.", e, new Object[0]);
        }
    }

    @Override // defpackage.p0e
    public void f(p4e p4eVar, x3e x3eVar) {
        try {
            ((p0e) this.b).f(p4eVar, x3eVar);
        } catch (RemoteException e) {
            ((kj) this.c).e("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    @Override // defpackage.p0e
    public void g(p4e p4eVar) {
        try {
            ((p0e) this.b).g(p4eVar);
        } catch (RemoteException e) {
            ((kj) this.c).e("RemoteException when sending token result.", e, new Object[0]);
        }
    }

    @Override // defpackage.f1f
    public byte[] h(byte[] bArr, hvc hvcVar) {
        bkf bkfVar = (bkf) this.b;
        byte[] b = ((hlf) hvcVar.b).b();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(ade.C(b), hu7.p(bkfVar));
        kkf kkfVar = kkf.f;
        ECParameterSpec p = hu7.p(bkfVar);
        byte[] r = hu7.r((ECPrivateKey) ((KeyFactory) kkfVar.a.zza("EC")).generatePrivate(eCPrivateKeySpec), (ECPublicKey) ((KeyFactory) kkfVar.a.zza("EC")).generatePublic(new ECPublicKeySpec(hu7.q(p.getCurve(), hkf.a, bArr), p)));
        byte[] H = yqe.H(bArr, ((hlf) hvcVar.c).b());
        byte[] H2 = yqe.H(t1f.m, mo19zza());
        fje fjeVar = (fje) this.c;
        int macLength = Mac.getInstance(fjeVar.b).getMacLength();
        byte[] bArr2 = t1f.o;
        Charset charset = k7f.a;
        return fjeVar.d(macLength, fjeVar.e(yqe.H(bArr2, H2, "eae_prk".getBytes(charset), r), null), yqe.H(t1f.b(2, macLength), bArr2, H2, "shared_secret".getBytes(charset), H));
    }

    public View j(int i, int i2, int i3, int i4) {
        int i5;
        mu0 mu0Var = (mu0) this.c;
        hcd hcdVar = (hcd) this.b;
        int m = hcdVar.m();
        int t = hcdVar.t();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View y = hcdVar.y(i);
            int h = hcdVar.h(y);
            int A = hcdVar.A(y);
            mu0Var.b = m;
            mu0Var.c = t;
            mu0Var.d = h;
            mu0Var.e = A;
            if (i3 != 0) {
                mu0Var.a = i3;
                if (mu0Var.a()) {
                    return y;
                }
            }
            if (i4 != 0) {
                mu0Var.a = i4;
                if (mu0Var.a()) {
                    view = y;
                }
            }
            i += i5;
        }
        return view;
    }

    public Object k() {
        ThreadLocal threadLocal = (ThreadLocal) this.c;
        Object obj = threadLocal.get();
        if (obj == null) {
            Object invoke = ((vt4) this.b).invoke();
            threadLocal.set(invoke);
            return invoke;
        }
        return obj;
    }

    public long l() {
        long j;
        int i;
        synchronized (this.b) {
            wu7 wu7Var = (wu7) this.c;
            int[] iArr = wu7Var.b;
            Object[] objArr = wu7Var.c;
            long[] jArr = wu7Var.a;
            int length = jArr.length - 2;
            j = 0;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j2) < 128) {
                                int i6 = (i2 << 3) + i5;
                                int i7 = iArr[i6];
                                o5b o5bVar = (o5b) objArr[i6];
                                i = i3;
                                if (o5bVar.c == p5b.e || o5bVar.b.f()) {
                                    j |= 1 << i7;
                                }
                            } else {
                                i = i3;
                            }
                            j2 >>= i;
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
        return j;
    }

    public void m() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.b;
        Resources.Theme theme = mainActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            iue.P(mainActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
    }

    public boolean n(View view) {
        mu0 mu0Var = (mu0) this.c;
        hcd hcdVar = (hcd) this.b;
        int m = hcdVar.m();
        int t = hcdVar.t();
        int h = hcdVar.h(view);
        int A = hcdVar.A(view);
        mu0Var.b = m;
        mu0Var.c = t;
        mu0Var.d = h;
        mu0Var.e = A;
        mu0Var.a = 24579;
        return mu0Var.a();
    }

    public void o(w5b w5bVar) {
        int i;
        wu7 wu7Var = (wu7) this.c;
        int[] iArr = wu7Var.b;
        Object[] objArr = wu7Var.c;
        long[] jArr = wu7Var.a;
        int i2 = 2;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr[i7];
                            o5b o5bVar = (o5b) objArr[i7];
                            p5b p5bVar = o5bVar.c;
                            rwa rwaVar = o5bVar.e;
                            int ordinal = p5bVar.ordinal();
                            if (ordinal != 0) {
                                i = i4;
                                if (ordinal != i2) {
                                    if (ordinal == 3) {
                                        m82 v1 = w5bVar.v1();
                                        iya iyaVar = o5bVar.d;
                                        if (iyaVar != null) {
                                            iyaVar.cancel(null);
                                        }
                                        o5bVar.d = z87.v(v1, null, null, new koa(rwaVar, o5bVar, null, 4), 3);
                                    }
                                } else {
                                    o5bVar.c = p5b.e;
                                    m82 v12 = w5bVar.v1();
                                    iya iyaVar2 = o5bVar.d;
                                    if (iyaVar2 != null) {
                                        iyaVar2.cancel(null);
                                    }
                                    o5bVar.d = z87.v(v12, null, null, new koa(rwaVar, o5bVar, null, 4), 3);
                                }
                            } else {
                                i = i4;
                                o5bVar.c = p5b.f;
                            }
                        } else {
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        i4 = i;
                        i2 = 2;
                    }
                    if (i5 != i4) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                    i2 = 2;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.b;
        String str = (String) this.c;
        lee leeVar = RecaptchaActivity.Y;
        if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                kw5 a = new le2().a();
                Intent intent = (Intent) a.b;
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                intent.setData((Uri) task.getResult());
                recaptchaActivity.startActivity(intent, (Bundle) a.c);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent2.putExtra("com.android.browser.application_id", str);
            intent2.addFlags(1073741824);
            intent2.addFlags(268435456);
            recaptchaActivity.startActivity(intent2);
            return;
        }
        Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        recaptchaActivity.q();
    }

    @Override // defpackage.av4
    public void onSuccess(Object obj) {
        yze yzeVar = (yze) this.c;
        yzeVar.W();
        lte lteVar = (lte) yzeVar.a;
        dre dreVar = lteVar.e;
        lte.k(dreVar);
        SparseArray d0 = dreVar.d0();
        p4f p4fVar = (p4f) this.b;
        d0.put(p4fVar.c, Long.valueOf(p4fVar.b));
        dre dreVar2 = lteVar.e;
        lte.k(dreVar2);
        int[] iArr = new int[d0.size()];
        long[] jArr = new long[d0.size()];
        for (int i = 0; i < d0.size(); i++) {
            iArr[i] = d0.keyAt(i);
            jArr[i] = ((Long) d0.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        dreVar2.J.u(bundle);
        yzeVar.E = false;
        yzeVar.F = 1;
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        ppeVar.I.f(p4fVar.a, "Successfully registered trigger URI");
        yzeVar.w0();
    }

    @Override // defpackage.p0e
    public void p(yb3 yb3Var) {
        try {
            ((p0e) this.b).p(yb3Var);
        } catch (RemoteException e) {
            ((kj) this.c).e("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    public void q(d89 d89Var) {
        this.c = d89Var;
        View findViewById = ((MainActivity) this.b).findViewById(16908290);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new owa(this, findViewById, 0));
    }

    @Override // defpackage.p0e
    public void r(odd oddVar) {
        try {
            ((p0e) this.b).r(oddVar);
        } catch (RemoteException e) {
            ((kj) this.c).e("RemoteException when sending failure result with credential", e, new Object[0]);
        }
    }

    @Override // defpackage.av4
    public void s(Throwable th) {
        yze yzeVar = (yze) this.c;
        yzeVar.W();
        lte lteVar = (lte) yzeVar.a;
        yzeVar.E = false;
        yzeVar.v0().add((p4f) this.b);
        if (yzeVar.F > ((Integer) yme.v0.a(null)).intValue()) {
            yzeVar.F = 1;
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.E.g(ppe.f0(lteVar.r().d0()), ppe.f0(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        ppe ppeVar2 = lteVar.f;
        lte.m(ppeVar2);
        ppeVar2.E.h("registerTriggerAsync failed. App ID, delay in seconds, throwable", ppe.f0(lteVar.r().d0()), ppe.f0(String.valueOf(yzeVar.F)), ppe.f0(th.toString()));
        int i = yzeVar.F;
        if (yzeVar.G == null) {
            yzeVar.G = new bxe(yzeVar, lteVar, 1);
        }
        yzeVar.G.b(i * 1000);
        int i2 = yzeVar.F;
        yzeVar.F = i2 + i2;
    }

    public void t(qya qyaVar, gq4 gq4Var) {
        qyaVar.getClass();
        ((omd) this.c).a.execute(new bn(8, this, qyaVar, gq4Var));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, l97] */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String str;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            am8.s(exception);
            String message = exception.getMessage();
            am8.s(message);
            return Tasks.forException(new Exception(message));
        }
        r4e r4eVar = (r4e) task.getResult();
        String str2 = r4eVar.a;
        if (str2 != null && !str2.isEmpty()) {
            gqe gqeVar = new gqe('/');
            ?? obj = new Object();
            obj.a = gqeVar;
            List H = new l97(obj).H(str2);
            if (H.size() != 4) {
                str = null;
            } else {
                str = (String) H.get(3);
            }
            if (TextUtils.isEmpty(str)) {
                return Tasks.forException(new Exception("Invalid siteKey format ".concat(str2)));
            }
            if (Log.isLoggable("RecaptchaHandler", 4)) {
                Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.b));
            }
            yv yvVar = (yv) this.c;
            qf4 qf4Var = (qf4) yvVar.d;
            qf4Var.a();
            ((fn8) yvVar.f).getClass();
            Task<RecaptchaTasksClient> fetchTaskClient = Recaptcha.fetchTaskClient((Application) qf4Var.a, str);
            yv yvVar2 = (yv) this.c;
            String str3 = (String) this.b;
            synchronized (yvVar2.a) {
                yvVar2.c = r4eVar;
                ((HashMap) yvVar2.b).put(str3, fetchTaskClient);
            }
            return fetchTaskClient;
        }
        return Tasks.forException(new Exception(s21.m("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.b)));
    }

    public String toString() {
        String concat;
        switch (this.a) {
            case 9:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.b);
                sb.append(' ');
                ArrayList arrayList = (ArrayList) this.c;
                if (arrayList.isEmpty()) {
                    concat = "";
                } else {
                    concat = "; ".concat(sl1.i0(arrayList, ";", null, null, null, 62));
                }
                sb.append(concat);
                return sb.toString();
            case 10:
                return "Bounds{lower=" + ((cx5) this.b) + " upper=" + ((cx5) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(qya qyaVar, int i) {
        qyaVar.getClass();
        ((omd) this.c).a.execute(new n0b((v69) this.b, qyaVar, false, i));
    }

    public float v(int i) {
        synchronized (this.b) {
            o5b o5bVar = (o5b) ((wu7) this.c).b(i);
            float f = nae.e;
            if (o5bVar == null) {
                return nae.e;
            }
            if (o5bVar.c != p5b.e) {
                f = ((Number) o5bVar.b.e()).floatValue();
            }
            return f;
        }
    }

    @Override // defpackage.p0e
    public void w(Status status, ru8 ru8Var) {
        try {
            ((p0e) this.b).w(status, ru8Var);
        } catch (RemoteException e) {
            ((kj) this.c).e("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    public int x(Context context, qz4 qz4Var) {
        int i;
        int i2;
        am8.s(context);
        am8.s(qz4Var);
        int i3 = qz4Var.i();
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(i3, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
        synchronized (sparseIntArray2) {
            i2 = 0;
            int i4 = 0;
            while (true) {
                try {
                    if (i4 < sparseIntArray2.size()) {
                        int keyAt = sparseIntArray2.keyAt(i4);
                        if (keyAt > i3 && sparseIntArray2.get(keyAt) == 0) {
                            break;
                        }
                        i4++;
                    } else {
                        i2 = -1;
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i2 == -1) {
                i2 = ((uz4) this.c).c(context, i3);
            }
            sparseIntArray2.put(i3, i2);
        }
        return i2;
    }

    public void y(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.b;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.c;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new fv(status));
            }
        }
    }

    @Override // defpackage.f1f
    /* renamed from: zza  reason: collision with other method in class */
    public byte[] mo19zza() {
        int i = x1f.a[((bkf) this.b).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return t1f.e;
                }
                hfd.j("Could not determine HPKE KEM ID");
                return null;
            }
            return t1f.d;
        }
        return t1f.c;
    }

    @Override // defpackage.p0e
    public void zza() {
        try {
            ((p0e) this.b).zza();
        } catch (RemoteException e) {
            ((kj) this.c).e("RemoteException when sending password reset response.", e, new Object[0]);
        }
    }

    public /* synthetic */ rwa(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ rwa(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public rwa(Context context, String str, String str2) {
        this.a = 26;
        if (str != null) {
            this.c = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.b = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.b = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        vs.m("keysetName cannot be null");
        throw null;
    }

    public rwa(AppMeasurementSdk appMeasurementSdk, s6f s6fVar) {
        this.a = 19;
        this.c = s6fVar;
        appMeasurementSdk.a(new jge(this, 0));
        this.b = new HashSet();
    }

    public rwa(g7f g7fVar, l7f l7fVar) {
        this.a = 28;
        Objects.requireNonNull(g7fVar);
        this.c = g7fVar;
        this.b = l7fVar;
    }

    public rwa(vt4 vt4Var) {
        this.a = 4;
        this.b = vt4Var;
        this.c = new ThreadLocal();
    }

    public rwa(p0e p0eVar, kj kjVar) {
        this.a = 16;
        am8.s(p0eVar);
        this.b = p0eVar;
        am8.s(kjVar);
        this.c = kjVar;
    }

    public rwa(String str, ArrayList arrayList) {
        this.a = 9;
        str.getClass();
        this.b = str;
        this.c = arrayList;
    }

    public rwa(yv yvVar, String str) {
        this.a = 18;
        this.b = str;
        Objects.requireNonNull(yvVar);
        this.c = yvVar;
    }

    public /* synthetic */ rwa(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public rwa(v69 v69Var, omd omdVar) {
        this.a = 11;
        v69Var.getClass();
        omdVar.getClass();
        this.b = v69Var;
        this.c = omdVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [mu0, java.lang.Object] */
    public rwa(hcd hcdVar) {
        this.a = 7;
        this.b = hcdVar;
        ?? obj = new Object();
        obj.a = 0;
        this.c = obj;
    }

    @Override // defpackage.g4a
    public void d(lac lacVar, t94 t94Var, zc7 zc7Var) {
    }

    public rwa(Context context, int i) {
        this.a = i;
        switch (i) {
            case 24:
                this.c = new AtomicLong(-1L);
                this.b = new tz4(context, null, xb4.n, new flb("mlkit:natural_language"), sz4.c);
                return;
            default:
                this.b = context;
                return;
        }
    }

    public rwa(WindowInsetsAnimation.Bounds bounds) {
        this.a = 10;
        this.b = xid.f(bounds);
        this.c = xid.e(bounds);
    }

    public rwa(MainActivity mainActivity) {
        this.a = 0;
        this.b = mainActivity;
        this.c = new p1a(10);
    }

    public rwa(toc tocVar) {
        this.a = 5;
        this.c = tocVar;
        this.b = new ea1(new byte[4], 4);
    }
}
