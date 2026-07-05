package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sg4  reason: default package */
/* loaded from: classes.dex */
public final class sg4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public sg4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z;
        int i = j4b.a;
        if (str != null && !str.trim().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        am8.u("ApplicationId must be set.", true ^ z);
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static sg4 a(Context context) {
        s26 s26Var = new s26(context, 25);
        String z = s26Var.z("google_app_id");
        if (TextUtils.isEmpty(z)) {
            return null;
        }
        return new sg4(z, s26Var.z("google_api_key"), s26Var.z("firebase_database_url"), s26Var.z("ga_trackingId"), s26Var.z("gcm_defaultSenderId"), s26Var.z("google_storage_bucket"), s26Var.z("recaptcha_site_key"), s26Var.z("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sg4)) {
            return false;
        }
        sg4 sg4Var = (sg4) obj;
        if (!hud.l(this.b, sg4Var.b) || !hud.l(this.a, sg4Var.a) || !hud.l(this.c, sg4Var.c) || !hud.l(this.d, sg4Var.d) || !hud.l(this.e, sg4Var.e) || !hud.l(this.f, sg4Var.f) || !hud.l(this.g, sg4Var.g) || !hud.l(this.h, sg4Var.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        s26 s26Var = new s26(this);
        s26Var.h(this.b, "applicationId");
        s26Var.h(this.a, "apiKey");
        s26Var.h(this.c, "databaseUrl");
        s26Var.h(this.e, "gcmSenderId");
        s26Var.h(this.f, "storageBucket");
        s26Var.h(this.g, "recaptchaSiteKey");
        s26Var.h(this.h, "projectId");
        return s26Var.toString();
    }
}
