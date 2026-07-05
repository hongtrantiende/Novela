package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k53  reason: default package */
/* loaded from: classes.dex */
public final class k53 {
    public final /* synthetic */ int a = 3;
    public final String b;
    public final String c;

    public k53(fz4 fz4Var) {
        this.b = fz4Var.Q("gcm.n.title");
        fz4Var.J("gcm.n.title");
        Object[] I = fz4Var.I("gcm.n.title");
        if (I != null) {
            String[] strArr = new String[I.length];
            for (int i = 0; i < I.length; i++) {
                strArr[i] = String.valueOf(I[i]);
            }
        }
        this.c = fz4Var.Q("gcm.n.body");
        fz4Var.J("gcm.n.body");
        Object[] I2 = fz4Var.I("gcm.n.body");
        if (I2 != null) {
            String[] strArr2 = new String[I2.length];
            for (int i2 = 0; i2 < I2.length; i2++) {
                strArr2[i2] = String.valueOf(I2[i2]);
            }
        }
        fz4Var.Q("gcm.n.icon");
        if (TextUtils.isEmpty(fz4Var.Q("gcm.n.sound2"))) {
            fz4Var.Q("gcm.n.sound");
        }
        fz4Var.Q("gcm.n.tag");
        fz4Var.Q("gcm.n.color");
        fz4Var.Q("gcm.n.click_action");
        fz4Var.Q("gcm.n.android_channel_id");
        String Q = fz4Var.Q("gcm.n.link_android");
        Q = TextUtils.isEmpty(Q) ? fz4Var.Q("gcm.n.link") : Q;
        if (!TextUtils.isEmpty(Q)) {
            Uri.parse(Q);
        }
        fz4Var.Q("gcm.n.image");
        fz4Var.Q("gcm.n.ticker");
        fz4Var.F("gcm.n.notification_priority");
        fz4Var.F("gcm.n.visibility");
        fz4Var.F("gcm.n.notification_count");
        fz4Var.u("gcm.n.sticky");
        fz4Var.u("gcm.n.local_only");
        fz4Var.u("gcm.n.default_sound");
        fz4Var.u("gcm.n.default_vibrate_timings");
        fz4Var.u("gcm.n.default_light_settings");
        fz4Var.K();
        fz4Var.H();
        fz4Var.V();
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public k53(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public k53(kw5 kw5Var) {
        Context context = (Context) kw5Var.b;
        int l = fca.l(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (l != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(l);
            this.c = string;
            String m = s21.m("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", m, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.b = "Flutter";
                this.c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.b = null;
                this.c = null;
            }
        }
        this.b = null;
        this.c = null;
    }

    public k53(Context context) {
        String packageName = context.getPackageName();
        am8.p(packageName);
        this.b = packageName;
        try {
            byte[] w = ote.w(context, packageName);
            if (w == null) {
                Log.e("FBA-PackageInfo", "single cert required: " + packageName);
                this.c = null;
                return;
            }
            this.c = jxe.m(w);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + packageName);
            this.c = null;
        }
    }
}
