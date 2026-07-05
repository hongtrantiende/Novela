package com.google.firebase.auth.internal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
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
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class GenericIdpActivity extends ur4 implements y0e {
    public static long X;
    public static final /* synthetic */ int Y = 0;
    public boolean W = false;

    static {
        lee leeVar = lee.b;
    }

    @Override // defpackage.y0e
    public final void a(Status status) {
        if (status == null) {
            q();
        } else {
            p(status);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
        r13 = r13.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
        if (r14 >= r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
        r15 = r13[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
        if (r15 < 'A') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
        if (r15 > 'Z') goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
        r13[r14] = (char) (r15 ^ ' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
        r13 = java.lang.String.valueOf(r13);
     */
    @Override // defpackage.y0e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri.Builder c(android.content.Intent r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.GenericIdpActivity.c(android.content.Intent, java.lang.String, java.lang.String):android.net.Uri$Builder");
    }

    @Override // defpackage.y0e
    public final void d(Uri uri, String str, l99 l99Var) {
        if (l99Var.get() == null) {
            Task forResult = Tasks.forResult(uri);
            hvc hvcVar = new hvc(12, false);
            hvcVar.b = this;
            hvcVar.c = str;
            forResult.addOnCompleteListener(hvcVar);
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // defpackage.ur4, defpackage.bu1, defpackage.au1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            q();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - X < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        X = currentTimeMillis;
        if (bundle != null) {
            this.W = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // defpackage.bu1, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [android.os.Parcelable, u5e, java.lang.Object] */
    @Override // defpackage.ur4, android.app.Activity
    public final void onResume() {
        String lowerCase;
        qf4 e;
        FirebaseAuth firebaseAuth;
        yz yzVar;
        j5e j5eVar;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                p(oee.a(intent.getStringExtra("firebaseError")));
            } else if (intent.hasExtra("link") && intent.hasExtra("eventId")) {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                synchronized (r0f.Q) {
                    am8.p(packageName);
                    am8.p(stringExtra2);
                    SharedPreferences E = r0f.E(this, packageName);
                    String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
                    String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
                    String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
                    String str5 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
                    String string = E.getString(str2, null);
                    String string2 = E.getString(str3, null);
                    String string3 = E.getString(str4, null);
                    String string4 = E.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
                    String string5 = E.getString(str5, null);
                    SharedPreferences.Editor edit = E.edit();
                    edit.remove(str2);
                    edit.remove(str3);
                    edit.remove(str4);
                    edit.remove(str5);
                    edit.apply();
                    if (string != null && string2 != null && string3 != null) {
                        j5eVar = new j5e(string, string2, string3, string4, string5, 1);
                    } else {
                        j5eVar = null;
                    }
                }
                if (j5eVar == null) {
                    q();
                }
                if (booleanExtra) {
                    stringExtra = sde.d(getApplicationContext(), qf4.e(j5eVar.e).f()).b(stringExtra);
                }
                ?? obj = new Object();
                am8.s(j5eVar);
                String str6 = j5eVar.a;
                am8.p(str6);
                obj.H = str6;
                am8.p(stringExtra);
                obj.I = stringExtra;
                String str7 = j5eVar.c;
                am8.p(str7);
                obj.e = str7;
                obj.E = true;
                obj.C = "providerId=".concat(str7);
                String str8 = j5eVar.d;
                String str9 = j5eVar.b;
                obj.J = str8;
                if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str9) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str9) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str9)) {
                    Log.e("GenericIdpActivity", "unsupported operation: ".concat(str9));
                    q();
                    return;
                }
                X = 0L;
                this.W = false;
                Intent intent2 = new Intent();
                Parcel obtain = Parcel.obtain();
                obj.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str9);
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                oaa.B(this).O(intent2);
                SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                Parcel obtain2 = Parcel.obtain();
                obj.writeToParcel(obtain2, 0);
                byte[] marshall2 = obtain2.marshall();
                obtain2.recycle();
                if (marshall2 != null) {
                    str = Base64.encodeToString(marshall2, 10);
                }
                edit2.putString("verifyAssertionRequest", str);
                edit2.putString("operation", str9);
                edit2.putString("tenantId", str8);
                edit2.putLong("timestamp", System.currentTimeMillis());
                edit2.commit();
                finish();
            } else {
                q();
            }
        } else if (!this.W) {
            String packageName2 = getPackageName();
            try {
                lowerCase = jxe.m(ote.w(this, packageName2)).toLowerCase(Locale.US);
                e = qf4.e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                firebaseAuth = FirebaseAuth.getInstance(e);
                yzVar = q2e.a;
                e.a();
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + " " + String.valueOf(e2));
                q();
            }
            if (!yzVar.containsKey(e.c.a)) {
                new t0e(packageName2, lowerCase, getIntent(), e, this).executeOnExecutor(firebaseAuth.r, new Void[0]);
                this.W = true;
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
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.W);
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
        vbe.a(getApplicationContext(), status);
        finish();
    }

    public final void q() {
        X = 0L;
        this.W = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        oaa.B(this).O(intent);
        vbe.a(this, am8.G("WEB_CONTEXT_CANCELED"));
        finish();
    }

    @Override // defpackage.y0e
    public final String zza(String str) {
        String G = zr1.G("firebear.identityToolkit");
        if (TextUtils.isEmpty(G)) {
            return q2e.b(str);
        }
        Log.e("GenericIdpActivity", "Found hermetic configuration for identityToolkit URL: " + G);
        return G;
    }
}
