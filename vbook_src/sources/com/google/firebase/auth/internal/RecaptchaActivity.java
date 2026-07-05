package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class RecaptchaActivity extends ur4 implements y0e {
    public static long X;
    public static final lee Y = lee.b;
    public boolean W = false;

    @Override // defpackage.y0e
    public final void a(Status status) {
        if (status == null) {
            q();
        } else {
            p(status);
        }
    }

    @Override // defpackage.y0e
    public final Uri.Builder c(Intent intent, String str, String str2) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler");
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        qf4 e = qf4.e(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(e);
        r0f r0fVar = r0f.Q;
        Context applicationContext = getApplicationContext();
        synchronized (r0fVar) {
            am8.p(str);
            am8.p(uuid);
            SharedPreferences E = r0f.E(applicationContext, str);
            r0f.G(E);
            SharedPreferences.Editor edit = E.edit();
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".FIREBASE_APP_NAME", stringExtra3);
            edit.apply();
        }
        String a = sde.d(getApplicationContext(), e.f()).a();
        String str3 = null;
        if (TextUtils.isEmpty(a)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            p(am8.G("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.g) {
        }
        if (!TextUtils.isEmpty(null)) {
            synchronized (firebaseAuth.g) {
            }
        } else {
            str3 = eg0.B();
        }
        Uri.Builder appendQueryParameter = appendPath.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid);
        appendQueryParameter.appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", a);
        return appendPath;
    }

    @Override // defpackage.y0e
    public final void d(Uri uri, String str, l99 l99Var) {
        if (l99Var.get() == null) {
            Task forResult = Tasks.forResult(uri);
            rwa rwaVar = new rwa(17, false);
            rwaVar.b = this;
            rwaVar.c = str;
            forResult.addOnCompleteListener(rwaVar);
            return;
        }
        vm1.h();
    }

    @Override // defpackage.y0e
    public final HttpURLConnection g(URL url) {
        try {
            synchronized (ade.class) {
            }
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            y0e.t.g("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // defpackage.ur4, defpackage.bu1, defpackage.au1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: " + action);
            q();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - X < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        X = currentTimeMillis;
        if (bundle != null) {
            this.W = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // defpackage.bu1, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.ur4, android.app.Activity
    public final void onResume() {
        RecaptchaActivity recaptchaActivity;
        String lowerCase;
        qf4 e;
        FirebaseAuth firebaseAuth;
        yz yzVar;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                p(oee.a(intent.getStringExtra("firebaseError")));
            } else if (intent.hasExtra("link") && intent.hasExtra("eventId")) {
                String stringExtra = intent.getStringExtra("link");
                r0f r0fVar = r0f.Q;
                Context applicationContext = getApplicationContext();
                String packageName = getPackageName();
                String stringExtra2 = intent.getStringExtra("eventId");
                synchronized (r0fVar) {
                    am8.p(packageName);
                    am8.p(stringExtra2);
                    SharedPreferences E = r0f.E(applicationContext, packageName);
                    String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
                    String string = E.getString(str2, null);
                    String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
                    String string2 = E.getString(str3, null);
                    SharedPreferences.Editor edit = E.edit();
                    edit.remove(str2);
                    edit.remove(str3);
                    edit.apply();
                    if (!TextUtils.isEmpty(string)) {
                        str = string2;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
                    p(am8.G("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = sde.d(getApplicationContext(), qf4.e(str).f()).b(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                X = 0L;
                this.W = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                oaa.B(this).O(intent2);
                SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                edit2.putString("recaptchaToken", queryParameter);
                edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                edit2.putLong("timestamp", System.currentTimeMillis());
                edit2.commit();
                finish();
            } else {
                q();
            }
        } else if (!this.W) {
            Intent intent3 = getIntent();
            String packageName2 = getPackageName();
            try {
                lowerCase = jxe.m(ote.w(this, packageName2)).toLowerCase(Locale.US);
                e = qf4.e(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                firebaseAuth = FirebaseAuth.getInstance(e);
                yzVar = q2e.a;
                e.a();
            } catch (PackageManager.NameNotFoundException e2) {
                recaptchaActivity = this;
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName2 + " " + String.valueOf(e2));
                recaptchaActivity.q();
            }
            if (!yzVar.containsKey(e.c.a)) {
                recaptchaActivity = this;
                new t0e(packageName2, lowerCase, intent3, e, recaptchaActivity).executeOnExecutor(firebaseAuth.r, new Void[0]);
                recaptchaActivity.W = true;
                return;
            }
            e.a();
            q2e.a(e.c.a);
            throw null;
        } else {
            q();
        }
    }

    @Override // defpackage.bu1, defpackage.au1, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.W);
    }

    public final void p(Status status) {
        X = 0L;
        this.W = false;
        Intent intent = new Intent();
        HashMap hashMap = oee.a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        oaa.B(this).O(intent);
        Y.a.getClass();
        vbe.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    public final void q() {
        X = 0L;
        this.W = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        oaa.B(this).O(intent);
        Y.a.getClass();
        vbe.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    @Override // defpackage.y0e
    public final String zza(String str) {
        String G = zr1.G("firebear.identityToolkit");
        if (TextUtils.isEmpty(G)) {
            return q2e.b(str);
        }
        Log.e("RecaptchaActivity", "Found hermetic configuration for identityToolkit URL: " + G);
        return G;
    }
}
