package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yvd  reason: default package */
/* loaded from: classes.dex */
public final class yvd implements Runnable {
    public static final kj c = new kj("RevokeAccessOperation", new String[0]);
    public final String a;
    public final l0b b;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.common.api.internal.BasePendingResult, l0b] */
    public yvd(String str) {
        am8.p(str);
        this.a = str;
        this.b = new BasePendingResult(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        kj kjVar = c;
        Status status = Status.C;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                kjVar.g("Unable to revoke access!", new Object[0]);
            }
            String str = "Response Code: " + responseCode;
            Object[] objArr = new Object[0];
            if (kjVar.a <= 3) {
                Log.d((String) kjVar.b, kjVar.k(str, objArr));
            }
        } catch (IOException e) {
            kjVar.g("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            kjVar.g("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.b.e(status);
    }
}
