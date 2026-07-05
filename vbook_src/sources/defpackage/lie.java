package defpackage;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lie  reason: default package */
/* loaded from: classes.dex */
public class lie implements k1e, gn9 {
    public final /* synthetic */ int a;
    public String b;
    public static final lie c = new lie(0, "TINK", false);
    public static final lie d = new lie(0, "CRUNCHY", false);
    public static final lie e = new lie(0, "NO_PREFIX", false);
    public static final lie f = new lie(1, "ASSUME_AES_GCM", false);
    public static final lie C = new lie(1, "ASSUME_XCHACHA20POLY1305", false);
    public static final lie D = new lie(1, "ASSUME_CHACHA20POLY1305", false);
    public static final lie E = new lie(1, "ASSUME_AES_CTR_HMAC", false);
    public static final lie F = new lie(1, "ASSUME_AES_EAX", false);
    public static final lie G = new lie(1, "ASSUME_AES_GCM_SIV", false);

    public lie(String str, int i) {
        this.a = i;
        switch (i) {
            case 6:
                am8.p(str);
                this.b = str;
                return;
            default:
                str.getClass();
                this.b = str;
                return;
        }
    }

    public static CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    sb.append(c(it.next()));
                }
            }
        } catch (IOException e2) {
            vs.j(e2);
        }
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
        uyeVar.T(S, 5);
    }

    public String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
            case 4:
            default:
                return super.toString();
            case 3:
                return s21.q(new StringBuilder("Phase('"), this.b, "')");
            case 5:
                return s21.p(new StringBuilder("<"), this.b, '>');
        }
    }

    @Override // defpackage.k1e
    public String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", "refresh_token");
        jSONObject.put("refreshToken", this.b);
        return jSONObject.toString();
    }

    public /* synthetic */ lie(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
    }
}
