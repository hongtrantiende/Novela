package defpackage;

import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mre  reason: default package */
/* loaded from: classes.dex */
public final class mre implements d0f {
    public final lte a;

    public mre(a6f a6fVar) {
        this.a = a6fVar.H;
    }

    @Override // defpackage.d0f, defpackage.tpe
    public /* synthetic */ void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.a.i(i, th, bArr);
    }

    public boolean b() {
        lte lteVar = this.a;
        try {
            zd0 a = wnd.a(lteVar.a);
            if (a == null) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.J.e("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.b(Token.CASE, "com.android.vending").versionCode < 80837300) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.J.f(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    public /* synthetic */ mre(lte lteVar) {
        this.a = lteVar;
    }
}
