package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: al5  reason: default package */
/* loaded from: classes.dex */
public final class al5 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final yhe a;
    public final Context b;
    public final String c;
    public final ig4 d;
    public final wf2 e;
    public pc0 f;

    public al5(Context context, String str, ig4 ig4Var, wf2 wf2Var) {
        if (context != null) {
            if (str != null) {
                this.b = context;
                this.c = str;
                this.d = ig4Var;
                this.e = wf2Var;
                this.a = new yhe();
                return;
            }
            vs.m("appIdentifier must not be null");
            throw null;
        }
        vs.m("appContext must not be null");
        throw null;
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(1:5))|6|(7:18|19|9|10|11|12|13)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eg4 b(boolean r9) {
        /*
            r8 = this;
            xa2 r2 = defpackage.ij1.E
            v7 r0 = new v7
            r6 = 0
            r7 = 14
            r1 = 0
            java.lang.Class<xa2> r3 = defpackage.xa2.class
            java.lang.String r4 = "isNotMainThread"
            java.lang.String r5 = "isNotMainThread()Z"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 != 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Must not be called on a main thread, was called on "
            r0.<init>(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L45
            android.util.Log.d(r2, r0, r1)
        L45:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4 = 10000(0x2710, double:4.9407E-320)
            ig4 r8 = r8.d
            if (r9 == 0) goto L64
            r9 = r8
            hg4 r9 = (defpackage.hg4) r9     // Catch: java.lang.Exception -> L5d
            com.google.android.gms.tasks.Task r9 = r9.d()     // Catch: java.lang.Exception -> L5d
            java.lang.Object r9 = com.google.android.gms.tasks.Tasks.await(r9, r4, r3)     // Catch: java.lang.Exception -> L5d
            rc0 r9 = (defpackage.rc0) r9     // Catch: java.lang.Exception -> L5d
            java.lang.String r9 = r9.a     // Catch: java.lang.Exception -> L5d
            goto L65
        L5d:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "Error getting Firebase authentication token."
            android.util.Log.w(r2, r0, r9)
        L64:
            r9 = r1
        L65:
            hg4 r8 = (defpackage.hg4) r8     // Catch: java.lang.Exception -> L73
            com.google.android.gms.tasks.Task r8 = r8.c()     // Catch: java.lang.Exception -> L73
            java.lang.Object r8 = com.google.android.gms.tasks.Tasks.await(r8, r4, r3)     // Catch: java.lang.Exception -> L73
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L73
            r1 = r8
            goto L7a
        L73:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Error getting Firebase installation id."
            android.util.Log.w(r2, r0, r8)
        L7a:
            eg4 r8 = new eg4
            r8.<init>(r1, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al5.b(boolean):eg4");
    }

    public final synchronized pc0 c() {
        String str;
        pc0 pc0Var = this.f;
        if (pc0Var != null && (pc0Var.b != null || !this.e.j())) {
            return this.f;
        }
        ox9 ox9Var = ox9.E;
        ox9Var.A("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        ox9Var.A("Cached Firebase Installation ID: " + string);
        if (this.e.j()) {
            eg4 b = b(false);
            ox9Var.A("Fetched Firebase Installation ID: " + b.a);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new eg4(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new pc0(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new pc0(a(sharedPreferences, b.a), b.a, b.b);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f = new pc0(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.f = new pc0(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        }
        ox9Var.A("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        yhe yheVar = this.a;
        Context context = this.b;
        synchronized (yheVar) {
            try {
                if (yheVar.b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    yheVar.b = installerPackageName;
                }
                if ("".equals(yheVar.b)) {
                    str = null;
                } else {
                    str = yheVar.b;
                }
            } finally {
            }
        }
        return str;
    }
}
