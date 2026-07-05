package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y0e  reason: default package */
/* loaded from: classes.dex */
public interface y0e {
    public static final kj t = new kj("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    void a(Status status);

    Uri.Builder c(Intent intent, String str, String str2);

    void d(Uri uri, String str, l99 l99Var);

    HttpURLConnection g(URL url);

    Context zza();

    String zza(String str);
}
