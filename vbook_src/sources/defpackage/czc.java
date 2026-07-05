package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: czc  reason: default package */
/* loaded from: classes3.dex */
public final class czc implements l1a {
    public final lw0 a;

    static {
        r76[] r76VarArr = lw0.h;
    }

    public czc(lw0 lw0Var) {
        this.a = lw0Var;
    }

    @Override // defpackage.l1a
    public final Object b(String str, Object[] objArr, m42 m42Var) {
        switch (str.hashCode()) {
            case -357549953:
                if (!str.equals("UserAgent_chrome")) {
                    return null;
                }
                return "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36";
            case 116250676:
                if (str.equals("UserAgent_system")) {
                    if (!this.a.a()) {
                        l53.e();
                        l53.d();
                        l53.a();
                        String str2 = Build.VERSION.RELEASE;
                        str2.getClass();
                        return "Mozilla/5.0 (Linux; Android " + str2 + "; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Mobile Safari/537.36";
                    }
                    return "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36";
                }
                return null;
            case 184783114:
                if (str.equals("UserAgent_android")) {
                    l53.d();
                    l53.a();
                    String str3 = Build.VERSION.RELEASE;
                    str3.getClass();
                    return "Mozilla/5.0 (Linux; Android " + str3 + "; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Mobile Safari/537.36";
                }
                return null;
            case 1062238248:
                if (str.equals("UserAgent_ios")) {
                    return "Mozilla/5.0 (iPhone; CPU iPhone OS 18_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.5 Mobile/15E148 Safari/604.1";
                }
                return null;
            default:
                return null;
        }
    }
}
