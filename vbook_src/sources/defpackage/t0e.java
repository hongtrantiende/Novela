package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t0e  reason: default package */
/* loaded from: classes.dex */
public final class t0e extends AsyncTask {
    public static final kj g = new kj("FirebaseAuth", "GetAuthDomainTask");
    public final String a;
    public final String b;
    public final WeakReference c;
    public final Uri.Builder d;
    public final String e;
    public final qf4 f;

    public t0e(String str, String str2, Intent intent, qf4 qf4Var, y0e y0eVar) {
        am8.p(str);
        this.a = str;
        this.f = qf4Var;
        am8.p(str2);
        am8.s(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        am8.p(stringExtra);
        Uri.Builder buildUpon = Uri.parse(y0eVar.zza(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        am8.s(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.b = buildUpon.build().toString();
        this.c = new WeakReference(y0eVar);
        this.d = y0eVar.c(intent, str, str2);
        this.e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    public static String a(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() >= 400) {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
                }
                return eh.E(new String(d(errorStream)));
            }
            return null;
        } catch (IOException e) {
            kj kjVar = g;
            Log.w((String) kjVar.b, kjVar.k("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e)), new Object[0]));
            return null;
        }
    }

    public static boolean c(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (!host.endsWith("firebaseapp.com")) {
                    if (host.endsWith("web.app")) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } catch (URISyntaxException e) {
            g.g(eub.p("Error parsing URL for auth domain check: ", str, ". ", e.getMessage()), new Object[0]);
        }
        return false;
    }

    public static byte[] d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[Token.CASE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: b */
    public final void onPostExecute(a1e a1eVar) {
        String str;
        String str2;
        Uri.Builder builder;
        y0e y0eVar = (y0e) this.c.get();
        if (a1eVar != null) {
            str = a1eVar.a;
            str2 = a1eVar.b;
        } else {
            str = null;
            str2 = null;
        }
        if (y0eVar == null) {
            g.g("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str) && (builder = this.d) != null) {
            builder.authority(str);
            y0eVar.d(builder.build(), this.a, FirebaseAuth.getInstance(this.f).p);
        } else {
            y0eVar.a(am8.G(str2));
        }
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [a1e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, me3] */
    /* JADX WARN: Type inference failed for: r9v18, types: [a1e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [a1e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v23, types: [a1e, java.lang.Object] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        String str = this.e;
        kj kjVar = g;
        try {
            URL url = new URL(this.b);
            y0e y0eVar = (y0e) this.c.get();
            HttpURLConnection g2 = y0eVar.g(url);
            g2.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            g2.setConnectTimeout(60000);
            new bm1(y0eVar.zza(), this.f, "X" + Integer.toString(r95.t().b)).b0(g2);
            int responseCode = g2.getResponseCode();
            if (responseCode != 200) {
                String a = a(g2);
                kjVar.g("Error getting project config. Failed with " + a + " " + responseCode, new Object[0]);
                ?? obj = new Object();
                obj.b = a;
                return obj;
            }
            ?? obj2 = new Object();
            obj2.zza(new String(d(g2.getInputStream())));
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = obj2.a;
            if (!isEmpty) {
                if (!arrayList.contains(str)) {
                    ?? obj3 = new Object();
                    obj3.b = "UNAUTHORIZED_DOMAIN";
                    return obj3;
                }
                ?? obj4 = new Object();
                obj4.a = str;
                return obj4;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj5 = arrayList.get(i);
                i++;
                String str2 = (String) obj5;
                if (c(str2)) {
                    ?? obj6 = new Object();
                    obj6.a = str2;
                    return obj6;
                }
            }
            return null;
        } catch (dzd e) {
            kjVar.g(s21.m("ConversionException encountered: ", e.getMessage()), new Object[0]);
            return null;
        } catch (IOException e2) {
            kjVar.g(s21.m("IOException occurred: ", e2.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e3) {
            kjVar.g(s21.m("Null pointer encountered: ", e3.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(Object obj) {
        a1e a1eVar = (a1e) obj;
        onPostExecute(null);
    }
}
