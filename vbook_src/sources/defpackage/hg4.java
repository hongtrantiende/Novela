package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hg4  reason: default package */
/* loaded from: classes.dex */
public final class hg4 implements ig4 {
    public static final Object m = new Object();
    public final qf4 a;
    public final fg4 b;
    public final eb5 c;
    public final c2d d;
    public final ze6 e;
    public final ug9 f;
    public final Object g;
    public final ExecutorService h;
    public final m9a i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ug9, java.lang.Object] */
    public hg4(qf4 qf4Var, l99 l99Var, ExecutorService executorService, m9a m9aVar) {
        qf4Var.a();
        fg4 fg4Var = new fg4(qf4Var.a, l99Var);
        eb5 eb5Var = new eb5(qf4Var);
        if (fn8.b == null) {
            fn8.b = new fn8(5);
        }
        fn8 fn8Var = fn8.b;
        if (c2d.c == null) {
            c2d.c = new c2d(fn8Var);
        }
        c2d c2dVar = c2d.c;
        ze6 ze6Var = new ze6(new gu1(qf4Var, 2));
        ?? obj = new Object();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = qf4Var;
        this.b = fg4Var;
        this.c = eb5Var;
        this.d = c2dVar;
        this.e = ze6Var;
        this.f = obj;
        this.h = executorService;
        this.i = m9aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        r3 = f(r2);
        r5 = r6.c;
        r2 = r2.a();
        r2.a = r3;
        r2.b = 3;
        r2 = r2.a();
        r5.q(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = defpackage.hg4.m
            monitor-enter(r0)
            qf4 r1 = r6.a     // Catch: java.lang.Throwable -> L3f
            r1.a()     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = r1.a     // Catch: java.lang.Throwable -> L3f
            kw5 r1 = defpackage.kw5.d(r1)     // Catch: java.lang.Throwable -> L3f
            eb5 r2 = r6.c     // Catch: java.lang.Throwable -> L37
            ad0 r2 = r2.u()     // Catch: java.lang.Throwable -> L37
            int r3 = r2.b     // Catch: java.lang.Throwable -> L37
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L1e
            if (r3 != r5) goto L1d
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L39
            java.lang.String r3 = r6.f(r2)     // Catch: java.lang.Throwable -> L37
            eb5 r5 = r6.c     // Catch: java.lang.Throwable -> L37
            zc0 r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r2.a = r3     // Catch: java.lang.Throwable -> L37
            r3 = 3
            r2.b = r3     // Catch: java.lang.Throwable -> L37
            ad0 r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r5.q(r2)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r6 = move-exception
            goto L50
        L39:
            if (r1 == 0) goto L41
            r1.B()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r6 = move-exception
            goto L56
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            r6.i(r2)
            m9a r0 = r6.i
            gg4 r1 = new gg4
            r1.<init>(r6, r4)
            r0.execute(r1)
            return
        L50:
            if (r1 == 0) goto L55
            r1.B()     // Catch: java.lang.Throwable -> L3f
        L55:
            throw r6     // Catch: java.lang.Throwable -> L3f
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg4.a():void");
    }

    public final ad0 b(ad0 ad0Var) {
        int i;
        int responseCode;
        boolean z;
        kd0 kd0Var;
        kd0 kd0Var2;
        fg4 fg4Var = this.b;
        qf4 qf4Var = this.a;
        qf4Var.a();
        String str = qf4Var.c.a;
        String str2 = ad0Var.a;
        qf4 qf4Var2 = this.a;
        qf4Var2.a();
        String str3 = qf4Var2.c.h;
        String str4 = ad0Var.d;
        x91 x91Var = fg4Var.c;
        if (x91Var.a()) {
            URL a = fg4.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i2 = 0; i2 <= 1; i2 = i + 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c = fg4Var.c(a, str);
                try {
                    try {
                        c.setRequestMethod("POST");
                        c.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        c.setDoOutput(true);
                        fg4.h(c);
                        responseCode = c.getResponseCode();
                        x91Var.b(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } finally {
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused) {
                    i = i2;
                }
                if (z) {
                    kd0Var2 = fg4.f(c);
                } else {
                    fg4.b(c, null, str, str3);
                    i = i2;
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) == 1) {
                                    kd0Var = new kd0(null, 0L, 2);
                                } else {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                            }
                        } else {
                            throw new e60("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", 11);
                        }
                    } else if (((byte) (0 | 1)) == 1) {
                        kd0Var = new kd0(null, 0L, 3);
                    } else {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    kd0Var2 = kd0Var;
                }
                int C = a82.C(kd0Var2.c);
                if (C != 0) {
                    if (C != 1) {
                        if (C == 2) {
                            synchronized (this) {
                                this.j = null;
                            }
                            zc0 a2 = ad0Var.a();
                            a2.b = 2;
                            return a2.a();
                        }
                        throw new e60("Firebase Installations Service is unavailable. Please try again later.", 11);
                    }
                    zc0 a3 = ad0Var.a();
                    a3.g = "BAD CONFIG";
                    a3.b = 5;
                    return a3.a();
                }
                String str5 = kd0Var2.a;
                long j = kd0Var2.b;
                this.d.a.getClass();
                zc0 a4 = ad0Var.a();
                a4.c = str5;
                a4.e = j;
                a4.f = System.currentTimeMillis() / 1000;
                a4.h = (byte) (((byte) (a4.h | 1)) | 2);
                return a4.a();
            }
            throw new e60("Firebase Installations Service is unavailable. Please try again later.", 11);
        }
        throw new e60("Firebase Installations Service is unavailable. Please try again later.", 11);
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        tx4 tx4Var = new tx4(taskCompletionSource);
        synchronized (this.g) {
            this.l.add(tx4Var);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new gg4(this, 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        mx4 mx4Var = new mx4(this.d, taskCompletionSource);
        synchronized (this.g) {
            this.l.add(mx4Var);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new gg4(this, 1));
        return task;
    }

    public final void e() {
        qf4 qf4Var = this.a;
        qf4Var.a();
        am8.q(qf4Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qf4Var.a();
        am8.q(qf4Var.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qf4Var.a();
        am8.q(qf4Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qf4Var.a();
        String str = qf4Var.c.b;
        Pattern pattern = c2d.b;
        am8.m("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        qf4Var.a();
        am8.m("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", c2d.b.matcher(qf4Var.c.a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.b) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(defpackage.ad0 r6) {
        /*
            r5 = this;
            qf4 r0 = r5.a
            r0.a()
            java.lang.String r0 = r0.b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            qf4 r0 = r5.a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
        L1e:
            int r6 = r6.b
            r0 = 1
            if (r6 != r0) goto L5c
            ze6 r6 = r5.e
            java.lang.Object r6 = r6.get()
            jl5 r6 = (defpackage.jl5) r6
            android.content.SharedPreferences r0 = r6.a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.a     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r6.a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r5 = move-exception
            goto L5a
        L41:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L56
            ug9 r5 = r5.f
            r5.getClass()
            java.lang.String r5 = defpackage.ug9.a()
            return r5
        L56:
            return r2
        L57:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r5     // Catch: java.lang.Throwable -> L3f
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r5
        L5c:
            ug9 r5 = r5.f
            r5.getClass()
            java.lang.String r5 = defpackage.ug9.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg4.f(ad0):java.lang.String");
    }

    public final ad0 g(ad0 ad0Var) {
        int responseCode;
        boolean z;
        qc0 e;
        String str = ad0Var.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            jl5 jl5Var = (jl5) this.e.get();
            synchronized (jl5Var.a) {
                try {
                    String[] strArr = jl5.c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String string = jl5Var.a.getString("|T|" + jl5Var.b + "|" + str3, null);
                            if (string != null && !string.isEmpty()) {
                                if (string.startsWith("{")) {
                                    try {
                                        str2 = new JSONObject(string).getString("token");
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    str2 = string;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        fg4 fg4Var = this.b;
        qf4 qf4Var = this.a;
        qf4Var.a();
        String str4 = qf4Var.c.a;
        String str5 = ad0Var.a;
        qf4 qf4Var2 = this.a;
        qf4Var2.a();
        String str6 = qf4Var2.c.h;
        qf4 qf4Var3 = this.a;
        qf4Var3.a();
        String str7 = qf4Var3.c.b;
        x91 x91Var = fg4Var.c;
        if (x91Var.a()) {
            URL a = fg4.a("projects/" + str6 + "/installations");
            for (int i2 = 0; i2 <= 1; i2++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c = fg4Var.c(a, str4);
                try {
                    try {
                        c.setRequestMethod("POST");
                        c.setDoOutput(true);
                        if (str2 != null) {
                            c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        fg4.g(c, str5, str7);
                        responseCode = c.getResponseCode();
                        x91Var.b(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } finally {
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (z) {
                    e = fg4.e(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    fg4.b(c, str7, str4, str6);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            try {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                qc0 qc0Var = new qc0(null, null, null, null, 2);
                                c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                e = qc0Var;
                            } catch (IOException | AssertionError unused3) {
                            }
                        }
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        throw new e60("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", 11);
                    }
                }
                int C = a82.C(e.e);
                if (C != 0) {
                    if (C == 1) {
                        zc0 a2 = ad0Var.a();
                        a2.g = "BAD CONFIG";
                        a2.b = 5;
                        return a2.a();
                    }
                    throw new e60("Firebase Installations Service is unavailable. Please try again later.", 11);
                }
                String str8 = e.b;
                String str9 = e.c;
                this.d.a.getClass();
                kd0 kd0Var = e.d;
                String str10 = kd0Var.a;
                long j = kd0Var.b;
                zc0 a3 = ad0Var.a();
                a3.a = str8;
                a3.b = 4;
                a3.c = str10;
                a3.d = str9;
                a3.e = j;
                a3.f = System.currentTimeMillis() / 1000;
                a3.h = (byte) (((byte) (a3.h | 1)) | 2);
                return a3.a();
            }
            throw new e60("Firebase Installations Service is unavailable. Please try again later.", 11);
        }
        throw new e60("Firebase Installations Service is unavailable. Please try again later.", 11);
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((gza) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(ad0 ad0Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((gza) it.next()).b(ad0Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
