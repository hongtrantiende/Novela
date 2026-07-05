package defpackage;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zhe  reason: default package */
/* loaded from: classes.dex */
public final class zhe implements ar3, l1e, gn9 {
    public final /* synthetic */ int a;
    public String b;
    public static final zhe c = new zhe("SHA1", 0);
    public static final zhe d = new zhe("SHA224", 0);
    public static final zhe e = new zhe("SHA256", 0);
    public static final zhe f = new zhe("SHA384", 0);
    public static final zhe C = new zhe("SHA512", 0);
    public static final zhe D = new zhe("TINK", 1);
    public static final zhe E = new zhe("NO_PREFIX", 1);

    public zhe(String str, boolean z, boolean z2) {
        this.a = 4;
        str.getClass();
        this.b = str;
    }

    public static void a(zg4 zg4Var, gea geaVar) {
        String str = geaVar.a;
        if (str != null) {
            zg4Var.Z("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        zg4Var.Z("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        zg4Var.Z("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.6");
        zg4Var.Z("Accept", "application/json");
        zg4Var.Z("X-CRASHLYTICS-DEVICE-MODEL", geaVar.b);
        String str2 = geaVar.c;
        if (str2 != null) {
            zg4Var.Z("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = geaVar.d;
        if (str3 != null) {
            zg4Var.Z("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = geaVar.e.c().a;
        if (str4 != null) {
            zg4Var.Z("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap b(gea geaVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", geaVar.h);
        hashMap.put("display_version", geaVar.g);
        hashMap.put("source", Integer.toString(geaVar.i));
        String str = geaVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // defpackage.gn9
    public void accept(Object obj, Object obj2) {
        int i = iye.l;
        ixe ixeVar = new ixe((TaskCompletionSource) obj2);
        uye uyeVar = (uye) ((wye) obj).l();
        String str = this.b;
        Parcel S = uyeVar.S();
        wbe.c(S, ixeVar);
        S.writeString(str);
        S.writeString("");
        S.writeString(null);
        uyeVar.T(S, 11);
    }

    public JSONObject c(ph5 ph5Var) {
        String str = this.b;
        int i = ph5Var.b;
        ox9 ox9Var = ox9.E;
        ox9Var.A("Settings response code was: " + i);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String m = hl5.m("Settings request failed; (status: ", ") from ", i, str);
            if (ox9Var.l(6)) {
                Log.e("FirebaseCrashlytics", m, null);
            }
            return null;
        }
        String str2 = ph5Var.a;
        try {
            return new JSONObject(str2);
        } catch (Exception e2) {
            ox9Var.D("Failed to parse settings JSON from ".concat(str), e2);
            ox9Var.D("Settings response " + str2, null);
            return null;
        }
    }

    @Override // defpackage.ar3
    public boolean i(CharSequence charSequence, int i, int i2, xsc xscVar) {
        if (TextUtils.equals(charSequence.subSequence(i, i2), this.b)) {
            xscVar.c = (xscVar.c & 3) | 4;
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.l1e
    public l1e zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.b = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e2) {
            String message = e2.getMessage();
            Log.e("zhe", "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new Exception(hl5.n("Failed to parse error for string [", str, "]"), e2);
        }
    }

    public /* synthetic */ zhe(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public zhe(String str, ox9 ox9Var) {
        this.a = 2;
        this.b = str;
    }

    @Override // defpackage.ar3
    public Object e() {
        return this;
    }
}
