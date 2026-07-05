package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.lifecycle.LifecycleService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yx9  reason: default package */
/* loaded from: classes.dex */
public class yx9 implements wx9, oa4, na4, x7b, a2e, OnCompleteListener, xs3 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public yx9(int i, byte b) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new AtomicReference(zve.g);
                this.c = new Object();
                return;
            case 11:
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                this.d = new WeakHashMap();
                return;
            case 19:
                this.b = new hxd("", 0L, null);
                this.c = new hxd("", 0L, null);
                this.d = new ArrayList();
                return;
            case 23:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = s8e.c;
                return;
            default:
                this.b = new LinkedHashMap();
                this.c = new eb5(15);
                this.d = new Object();
                return;
        }
    }

    public static Object d(Task task) {
        try {
            return Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        }
    }

    @Override // defpackage.x7b
    public int a(long j) {
        long[] jArr = (long[]) this.d;
        int b = a2d.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override // defpackage.xs3
    public /* bridge */ /* synthetic */ xs3 b(Class cls, e78 e78Var) {
        ((HashMap) this.b).put(cls, e78Var);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override // defpackage.x7b
    public long c(int i) {
        boolean z;
        long[] jArr = (long[]) this.d;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        if (i < jArr.length) {
            z2 = true;
        }
        wq9.s(z2);
        return jArr[i];
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.a) {
            case 19:
                yx9 yx9Var = new yx9(((hxd) this.b).clone());
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ArrayList) yx9Var.d).add(((hxd) obj).clone());
                }
                return yx9Var;
            default:
                return super.clone();
        }
    }

    public String e(String str, long j, long j2, int i) {
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.c;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int size = arrayList2.size();
            ArrayList arrayList3 = (ArrayList) this.b;
            if (i2 < size) {
                sb.append((String) arrayList3.get(i2));
                if (((Integer) arrayList2.get(i2)).intValue() == 1) {
                    sb.append(str);
                } else if (((Integer) arrayList2.get(i2)).intValue() == 2) {
                    sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j)));
                } else if (((Integer) arrayList2.get(i2)).intValue() == 3) {
                    sb.append(String.format(Locale.US, (String) arrayList.get(i2), Integer.valueOf(i)));
                } else if (((Integer) arrayList2.get(i2)).intValue() == 4) {
                    sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j2)));
                }
                i2++;
            } else {
                sb.append((String) arrayList3.get(arrayList2.size()));
                return sb.toString();
            }
        }
    }

    @Override // defpackage.x7b
    public List f(long j) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                vhd vhdVar = (vhd) list.get(i);
                td2 td2Var = vhdVar.a;
                if (td2Var.e == -3.4028235E38f) {
                    arrayList2.add(vhdVar);
                } else {
                    arrayList.add(td2Var);
                }
            }
        }
        Collections.sort(arrayList2, new uk(28));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            sd2 a = ((vhd) arrayList2.get(i3)).a.a();
            a.e = (-1) - i3;
            a.f = 1;
            arrayList.add(a.a());
        }
        return arrayList;
    }

    @Override // defpackage.x7b
    public int g() {
        return ((long[]) this.d).length;
    }

    @Override // defpackage.k99
    public Object get() {
        switch (this.a) {
            case 1:
                return new zg4(11, (Context) ((k99) this.b).get(), (hw9) ((k99) this.c).get(), (dd0) ((d38) this.d).get());
            case 2:
            case 3:
            default:
                return new knc(new tw8(7), new jf8(7), (tw2) ((bm1) this.b).get(), (tc0) ((qu1) this.c).get(), (odd) ((odd) this.d).get());
            case 4:
                return new dea((d82) ((j99) this.b).get(), (t9c) ((j99) this.c).get(), (ng2) ((j99) this.d).get());
            case 5:
                long i = hc2.i();
                if (i == i7c.a) {
                    return this.d;
                }
                e7c e7cVar = (e7c) ((AtomicReference) this.b).get();
                int a = e7cVar.a(i);
                if (a >= 0) {
                    return e7cVar.c[a];
                }
                return null;
        }
    }

    public Typeface h(int i, int i2, cw cwVar) {
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = kr9.a;
            if (context.isRestricted()) {
                return null;
            }
            return kr9.a(context, resourceId, typedValue, i2, cwVar, true);
        }
        return null;
    }

    public boolean i() {
        if (((yya) this.b).getValue() == this.d) {
            yx9 yx9Var = (yx9) this.c;
            if (yx9Var == null || !yx9Var.i()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void j(String str, String str2, String str3, String str4) {
        qf4 qf4Var = (qf4) this.c;
        if (str2 != null && str3 != null) {
            qf4Var.a();
            sg4 sg4Var = qf4Var.c;
            String str5 = sg4Var.h;
            qf4Var.a();
            String str6 = sg4Var.a;
            if (str5 != null) {
                URL url = new URL(nk2.v(nk2.y("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/"), str, ":", str4));
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder y = nk2.y("Topic ", str4, " for: ", str, " with url: ");
                    y.append(url);
                    Log.d("FirebaseMessaging", y.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("x-goog-api-key", str6);
                httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
                httpURLConnection.setDoOutput(false);
                try {
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        httpURLConnection.disconnect();
                        if (responseCode >= 200 && responseCode < 300) {
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", hl5.o("Topic ", str4, " for: ", str, " succeeded."));
                                return;
                            }
                            return;
                        } else if (responseCode != 404 && responseCode != 403) {
                            if (responseCode >= 500) {
                                fb4.k("INTERNAL_SERVER_ERROR");
                                return;
                            }
                            throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
                        } else {
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                StringBuilder o = a82.o("Topic ", str4, " failed: ");
                                o.append(httpURLConnection.getResponseMessage());
                                Log.d("FirebaseMessaging", o.toString());
                            }
                            StringBuilder o2 = a82.o("Topic ", str4, " failed: ");
                            o2.append(httpURLConnection.getResponseMessage());
                            throw new IOException(o2.toString());
                        }
                    } catch (IOException e) {
                        throw new IOException("SERVICE_NOT_AVAILABLE", e);
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            }
            fb4.k("Project ID or API Key is missing");
            return;
        }
        fb4.k("FIS auth token or FIS ID is empty");
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [l1e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [l1e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [l1e, java.lang.Object] */
    @Override // defpackage.a2e
    public void k(l1e l1eVar) {
        switch (this.a) {
            case 14:
                h5e h5eVar = (h5e) l1eVar;
                ((k57) this.d).J(new p4e(h5eVar.b, h5eVar.a, Long.valueOf(h5eVar.c), "Bearer"), null, "password", Boolean.FALSE, null, (rwa) this.b, this);
                return;
            case 15:
                rwa rwaVar = (rwa) this.b;
                d6e d6eVar = (d6e) l1eVar;
                if (!TextUtils.isEmpty(d6eVar.e)) {
                    rwaVar.w(new Status(17025, null, null, null), new ru8(null, null, d6eVar.f, d6eVar.e, true));
                    return;
                }
                ((k57) ((yx9) this.d).d).J(new p4e(d6eVar.b, d6eVar.a, Long.valueOf(d6eVar.c), "Bearer"), null, "phone", Boolean.valueOf(d6eVar.d), null, rwaVar, (yx9) this.c);
                return;
            case 16:
                wf2 wf2Var = (wf2) this.b;
                wf2Var.f = ((p4e) l1eVar).b;
                qu1 qu1Var = (qu1) ((k57) this.d).b;
                yx9 yx9Var = new yx9(this, (rwa) this.c, this, 15);
                h1e h1eVar = (h1e) qu1Var.a;
                ch0.w(h1eVar.f("/verifyPhoneNumber", (String) qu1Var.f), wf2Var, yx9Var, new Object(), (bm1) h1eVar.c);
                return;
            case 17:
                k57.G((k57) ((yx9) this.d).d, (x5e) l1eVar, (rwa) this.b, this);
                return;
            case 18:
                u5e u5eVar = (u5e) this.b;
                u5eVar.K = true;
                String str = ((p4e) l1eVar).b;
                am8.p(str);
                u5eVar.b = str;
                qu1 qu1Var2 = (qu1) ((k57) this.d).b;
                yx9 yx9Var2 = new yx9(this, (rwa) this.c, this, 17);
                qu1Var2.getClass();
                h1e h1eVar2 = (h1e) qu1Var2.a;
                ch0.w(h1eVar2.f("/verifyAssertion", (String) qu1Var2.f), u5eVar, yx9Var2, new Object(), (bm1) h1eVar2.c);
                return;
            default:
                p4e p4eVar = (p4e) l1eVar;
                w2e w2eVar = new w2e(2);
                fz0 fz0Var = new fz0(3);
                w2eVar.e = fz0Var;
                w2eVar.f = new fz0(3);
                String str2 = p4eVar.b;
                am8.p(str2);
                w2eVar.b = str2;
                l0d l0dVar = (l0d) this.b;
                boolean z = l0dVar.c;
                String str3 = l0dVar.a;
                ArrayList arrayList = fz0Var.a;
                if (z || str3 != null) {
                    if (str3 == null) {
                        arrayList.add("DISPLAY_NAME");
                    } else {
                        w2eVar.c = str3;
                    }
                }
                if (l0dVar.d || l0dVar.e != null) {
                    String str4 = l0dVar.b;
                    if (str4 == null) {
                        arrayList.add("PHOTO_URL");
                    } else {
                        w2eVar.d = str4;
                    }
                }
                k57 k57Var = (k57) this.d;
                rwa rwaVar2 = (rwa) this.c;
                fje fjeVar = new fje(p4eVar.b, 6);
                qu1 qu1Var3 = (qu1) k57Var.b;
                bm1 bm1Var = new bm1(k57Var, this, rwaVar2, p4eVar, w2eVar);
                h1e h1eVar3 = (h1e) qu1Var3.a;
                ch0.w(h1eVar3.f("/getAccountInfo", (String) qu1Var3.f), fjeVar, bm1Var, new Object(), (bm1) h1eVar3.c);
                return;
        }
    }

    public void l(jn6 jn6Var) {
        maa maaVar = (maa) this.d;
        if (maaVar != null) {
            maaVar.run();
        }
        maa maaVar2 = new maa((xn6) this.b, jn6Var);
        this.d = maaVar2;
        ((Handler) this.c).postAtFrontOfQueue(maaVar2);
    }

    public void m() {
        ((TypedArray) this.c).recycle();
    }

    public void n(Object obj) {
        long i = hc2.i();
        if (i == i7c.a) {
            this.d = obj;
            return;
        }
        synchronized (this.c) {
            e7c e7cVar = (e7c) ((AtomicReference) this.b).get();
            int a = e7cVar.a(i);
            if (a < 0) {
                ((AtomicReference) this.b).set(e7cVar.b(obj, i));
            } else {
                e7cVar.c[a] = obj;
            }
        }
    }

    public void o() {
        tv7 tv7Var = (tv7) this.b;
        String str = (String) this.c;
        List list = (List) tv7Var.l(str);
        if (list != null) {
            list.remove((vt4) this.d);
        }
        if (list != null && !list.isEmpty()) {
            tv7Var.n(str, list);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        jla jlaVar = ((kv9) this.b).a;
        synchronized (jlaVar) {
            jlaVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public eie p() {
        xk9 xk9Var;
        hlf b;
        oie oieVar = (oie) this.b;
        if (oieVar != null && (xk9Var = (xk9) this.c) != null) {
            if (oieVar.a == ((hlf) xk9Var.b).a.length) {
                if (oieVar.a() && ((Integer) this.d) == null) {
                    hfd.j("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                } else if (!((oie) this.b).a() && ((Integer) this.d) != null) {
                    hfd.j("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                } else {
                    lie lieVar = ((oie) this.b).d;
                    if (lieVar == lie.e) {
                        b = o5f.a;
                    } else if (lieVar == lie.d) {
                        b = o5f.a(((Integer) this.d).intValue());
                    } else if (lieVar == lie.c) {
                        b = o5f.b(((Integer) this.d).intValue());
                    } else {
                        vs.k("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(lieVar)));
                        return null;
                    }
                    return new eie((oie) this.b, (xk9) this.c, b, (Integer) this.d);
                }
            }
            hfd.j("Key size mismatch");
            return null;
        }
        hfd.j("Cannot build without parameters and/or key material");
        return null;
    }

    public rie q() {
        xk9 xk9Var;
        hlf b;
        gje gjeVar = (gje) this.b;
        if (gjeVar != null && (xk9Var = (xk9) this.c) != null) {
            if (gjeVar.a == ((hlf) xk9Var.b).a.length) {
                if (gjeVar.a() && ((Integer) this.d) == null) {
                    hfd.j("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                } else if (!((gje) this.b).a() && ((Integer) this.d) != null) {
                    hfd.j("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                } else {
                    fje fjeVar = ((gje) this.b).d;
                    if (fjeVar == fje.e) {
                        b = o5f.a;
                    } else if (fjeVar == fje.d) {
                        b = o5f.a(((Integer) this.d).intValue());
                    } else if (fjeVar == fje.c) {
                        b = o5f.b(((Integer) this.d).intValue());
                    } else {
                        vs.k("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(fjeVar)));
                        return null;
                    }
                    return new rie((gje) this.b, (xk9) this.c, b, (Integer) this.d);
                }
            }
            hfd.j("Key size mismatch");
            return null;
        }
        hfd.j("Cannot build without parameters and/or key material");
        return null;
    }

    public void r(Object obj, String str) {
        yx9 yx9Var = new yx9((char) 0, 24);
        ((yx9) this.d).d = yx9Var;
        this.d = yx9Var;
        yx9Var.b = obj;
        yx9Var.c = str;
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 25:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.c);
                sb.append('{');
                yx9 yx9Var = (yx9) ((yx9) this.b).d;
                while (yx9Var != null) {
                    Object obj = yx9Var.b;
                    sb.append(str);
                    String str2 = (String) yx9Var.c;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    yx9Var = (yx9) yx9Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 29:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.c);
                sb2.append('{');
                yx9 yx9Var2 = (yx9) ((yx9) this.b).d;
                while (yx9Var2 != null) {
                    Object obj2 = yx9Var2.b;
                    sb2.append(str);
                    String str3 = (String) yx9Var2.c;
                    if (str3 != null) {
                        sb2.append(str3);
                        sb2.append('=');
                    }
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb2.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb2.append(obj2);
                    }
                    yx9Var2 = (yx9) yx9Var2.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.a2e
    /* renamed from: zza */
    public void mo0zza(String str) {
        switch (this.a) {
            case 14:
                ((yv) this.c).mo0zza(str);
                return;
            case 15:
                ((yx9) this.c).mo0zza(str);
                return;
            case 16:
                ((rwa) this.c).a(am8.G(str));
                return;
            case 17:
                ((yx9) this.c).mo0zza(str);
                return;
            case 18:
                ((rwa) this.c).a(am8.G(str));
                return;
            default:
                ((rwa) this.c).a(am8.G(str));
                return;
        }
    }

    public /* synthetic */ yx9(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ yx9(a2e a2eVar, rwa rwaVar, a2e a2eVar2, int i) {
        this.a = i;
        this.b = rwaVar;
        this.c = a2eVar2;
        this.d = a2eVar;
    }

    public yx9(k57 k57Var, wf2 wf2Var, rwa rwaVar) {
        this.a = 16;
        this.b = wf2Var;
        this.c = rwaVar;
        Objects.requireNonNull(k57Var);
        this.d = k57Var;
    }

    public yx9(k57 k57Var, rwa rwaVar, yv yvVar) {
        this.a = 14;
        this.b = rwaVar;
        this.c = yvVar;
        Objects.requireNonNull(k57Var);
        this.d = k57Var;
    }

    public yx9(k57 k57Var, l0d l0dVar, rwa rwaVar) {
        this.a = 21;
        this.b = l0dVar;
        this.c = rwaVar;
        Objects.requireNonNull(k57Var);
        this.d = k57Var;
    }

    public yx9(k57 k57Var, u5e u5eVar, rwa rwaVar) {
        this.a = 18;
        this.b = u5eVar;
        this.c = rwaVar;
        Objects.requireNonNull(k57Var);
        this.d = k57Var;
    }

    public yx9(String str, int i) {
        this.a = i;
        switch (i) {
            case 29:
                yx9 yx9Var = new yx9((char) 0, 26);
                this.b = yx9Var;
                this.d = yx9Var;
                this.c = str;
                return;
            default:
                yx9 yx9Var2 = new yx9((char) 0, 24);
                this.b = yx9Var2;
                this.d = yx9Var2;
                this.c = str;
                return;
        }
    }

    public yx9(hxd hxdVar) {
        this.a = 19;
        this.b = hxdVar;
        this.c = hxdVar.clone();
        this.d = new ArrayList();
    }

    public yx9(LifecycleService lifecycleService) {
        this.a = 3;
        this.b = new xn6(lifecycleService, true);
        this.c = new Handler(Looper.getMainLooper());
    }

    public yx9(ArrayList arrayList) {
        this.a = 13;
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            vhd vhdVar = (vhd) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            jArr[i2] = vhdVar.b;
            jArr[i2 + 1] = vhdVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public yx9(qf4 qf4Var, FirebaseMessaging firebaseMessaging, ig4 ig4Var) {
        this.a = 8;
        this.b = ig4Var;
        this.c = qf4Var;
        this.d = firebaseMessaging;
    }

    public yx9(Context context, TypedArray typedArray) {
        this.a = 7;
        this.b = context;
        this.c = typedArray;
    }

    public /* synthetic */ yx9(char c, int i) {
        this.a = i;
    }

    public yx9(ctc ctcVar, yx9 yx9Var) {
        this.a = 10;
        this.b = ctcVar;
        this.c = yx9Var;
        this.d = ctcVar.getValue();
    }

    public yx9(int i) {
        this.a = 6;
        this.b = i != 1 ? new ypa(i) : null;
    }
}
