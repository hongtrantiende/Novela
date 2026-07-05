package com.reader.data.messaging;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class BroadcastMessagingService extends FirebaseMessagingService implements p96 {
    public static final /* synthetic */ int I = 0;
    public final ye6 E;
    public final ye6 F;
    public final ye6 G;
    public final m41 H;

    public BroadcastMessagingService() {
        ov0 ov0Var = new ov0(this, 0);
        sk6 sk6Var = sk6.a;
        this.E = ipe.x(sk6Var, ov0Var);
        this.F = ipe.x(sk6Var, new ov0(this, 1));
        this.G = ipe.x(sk6Var, new ov0(this, 2));
        b9b b = rse.b();
        sw2 sw2Var = ab3.a;
        this.H = k27.a(nq2.C(b, ru2.c));
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [yz, jla] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(in9 in9Var) {
        int i;
        String obj;
        Integer R;
        String string;
        String str;
        Bundle bundle = in9Var.a;
        if (in9Var.b == null) {
            ?? jlaVar = new jla(0);
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (obj2 instanceof String) {
                    String str3 = (String) obj2;
                    if (!str2.startsWith("google.") && !str2.startsWith("gcm.") && !str2.equals("from") && !str2.equals("message_type") && !str2.equals("collapse_key")) {
                        jlaVar.put(str2, str3);
                    }
                }
            }
            in9Var.b = jlaVar;
        }
        HashMap hashMap = new HashMap(in9Var.b);
        String str4 = "";
        if (!hashMap.isEmpty()) {
            try {
                String str5 = (String) hashMap.get("type");
                if (str5 == null) {
                    f(hashMap);
                    return;
                }
                String str6 = (String) hashMap.get("user_name");
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = (String) hashMap.get("user_id");
                if (str7 == null) {
                    str7 = "";
                }
                int hashCode = str5.hashCode();
                ye6 ye6Var = this.G;
                gs3 gs3Var = gs3.a;
                if (hashCode != -769131171) {
                    if (hashCode != -506382857) {
                        if (hashCode == 1940515205 && str5.equals("push_reply")) {
                            if (!str7.equals(((k0d) ye6Var.getValue()).c())) {
                                String str8 = (String) hashMap.get("topic_id");
                                String str9 = (String) hashMap.get("report_id");
                                if (str8 != null) {
                                    String str10 = (String) hashMap.get("topic_title");
                                    if (str10 != null) {
                                        str4 = str10;
                                    }
                                    String a = yr2.a("topic", new yk8("id", str8));
                                    Context applicationContext = getApplicationContext();
                                    applicationContext.getClass();
                                    Uri parse = Uri.parse(a);
                                    parse.getClass();
                                    ay5.q(applicationContext, str4, (String) z87.C(gs3Var, new nv0(str6, str4, null, 0)), parse);
                                    return;
                                } else if (str9 != null) {
                                    String str11 = (String) hashMap.get("report_title");
                                    if (str11 != null) {
                                        str4 = str11;
                                    }
                                    String a2 = yr2.a("report", new yk8("id", str9));
                                    Context applicationContext2 = getApplicationContext();
                                    applicationContext2.getClass();
                                    Uri parse2 = Uri.parse(a2);
                                    parse2.getClass();
                                    ay5.q(applicationContext2, str4, (String) z87.C(gs3Var, new nv0(str6, str4, null, 1)), parse2);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                    } else if (str5.equals("push_upgrade")) {
                        String string2 = getApplicationContext().getString(getApplicationContext().getApplicationInfo().labelRes);
                        string2.getClass();
                        Context applicationContext3 = getApplicationContext();
                        applicationContext3.getClass();
                        ay5.q(applicationContext3, string2, (String) z87.C(gs3Var, new gf(2, 16, null)), null);
                        return;
                    }
                } else if (str5.equals("push_chat")) {
                    if (!str7.equals(((k0d) ye6Var.getValue()).c())) {
                        dx dxVar = (dx) this.F.getValue();
                        if (((Boolean) dxVar.y.c(dx.W[23], dxVar)).booleanValue()) {
                            String str12 = (String) hashMap.get("msg_type");
                            if (str12 != null && (R = r4b.R(10, str12)) != null) {
                                i = R.intValue();
                            } else {
                                i = 0;
                            }
                            String str13 = (String) hashMap.get("content");
                            if (str13 == null) {
                                str13 = "";
                            }
                            String str14 = (String) hashMap.get("conversation_id");
                            if (str14 != null) {
                                str4 = str14;
                            }
                            if (i == 1) {
                                obj = (String) z87.C(gs3Var, new mv0(0, null, str6));
                            } else {
                                obj = k4b.N0(Html.fromHtml(str13, 0).toString()).toString();
                            }
                            String a3 = yr2.a("chat", new yk8("id", str4));
                            Context applicationContext4 = getApplicationContext();
                            applicationContext4.getClass();
                            Uri parse3 = Uri.parse(a3);
                            parse3.getClass();
                            ay5.q(applicationContext4, str6, obj, parse3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                f(hashMap);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (in9Var.c == null && fz4.Y(bundle)) {
            in9Var.c = new k53(new fz4(bundle));
        }
        k53 k53Var = in9Var.c;
        if (k53Var == null || (string = k53Var.b) == null) {
            string = getApplicationContext().getString(getApplicationContext().getApplicationInfo().labelRes);
            string.getClass();
        }
        if (in9Var.c == null && fz4.Y(bundle)) {
            in9Var.c = new k53(new fz4(bundle));
        }
        k53 k53Var2 = in9Var.c;
        if (k53Var2 != null && (str = k53Var2.c) != null) {
            str4 = str;
        }
        Context applicationContext5 = getApplicationContext();
        applicationContext5.getClass();
        ay5.q(applicationContext5, string, str4, null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(String str) {
        str.getClass();
        z87.v(this.H, null, null, new cv0(this, str, null, 1), 3);
    }

    public final void f(HashMap hashMap) {
        String str = (String) hashMap.get("title");
        if (str == null) {
            str = getApplicationContext().getString(getApplicationContext().getApplicationInfo().labelRes);
            str.getClass();
        }
        String str2 = (String) hashMap.get("body");
        if (str2 == null && (str2 = (String) hashMap.get("content")) == null) {
            str2 = "";
        }
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        ay5.q(applicationContext, str, str2, null);
    }
}
