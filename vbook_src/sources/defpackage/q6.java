package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.Script;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements a6, iz, fz2, hu1, Continuation, or6, iy2, t38, zk0, xo9, OnSuccessListener, ContextAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q6(cd cdVar, cs6 cs6Var, h57 h57Var, IOException iOException, boolean z) {
        this.a = 11;
        this.b = h57Var;
    }

    @Override // defpackage.iz
    public int b(int i, tc6 tc6Var) {
        return ((lk0) this.b).a(0, i, tc6Var);
    }

    @Override // defpackage.iy2
    public mm9 c(int i, ajc ajcVar, int[] iArr) {
        gy2 gy2Var = (gy2) this.b;
        ls5 i2 = qs5.i();
        for (int i3 = 0; i3 < ajcVar.a; i3++) {
            i2.b(new dy2(i, ajcVar, i3, gy2Var, iArr[i3]));
        }
        return i2.g();
    }

    public x91 d(ij1 ij1Var) {
        InputStream inputStream;
        y91 y91Var = (y91) this.b;
        URL url = (URL) ij1Var.b;
        String p = mwe.p("CctTransportBackend");
        if (Log.isLoggable(p, 4)) {
            Log.i(p, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(y91Var.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) ij1Var.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                n07 n07Var = y91Var.a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                f46 f46Var = (f46) n07Var.b;
                t56 t56Var = new t56(bufferedWriter, f46Var.a, f46Var.b, f46Var.c, f46Var.d);
                t56Var.h((ta0) ij1Var.c);
                t56Var.j();
                t56Var.b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String p2 = mwe.p("CctTransportBackend");
                if (Log.isLoggable(p2, 4)) {
                    Log.i(p2, String.format("Status Code: %d", valueOf));
                }
                mwe.l(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                mwe.l(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new x91(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        x91 x91Var = new x91(responseCode, null, wc0.a(new BufferedReader(new InputStreamReader(inputStream))).a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return x91Var;
                    } catch (Throwable th) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                return new x91(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ct3 e) {
            e = e;
            mwe.m(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new x91(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            mwe.m(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new x91(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            mwe.m(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new x91(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            mwe.m(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new x91(400, null, 0L);
        }
    }

    @Override // defpackage.a6
    public void e(Object obj) {
        ((xt4) ((aw7) this.b).getValue()).invoke(obj);
    }

    @Override // defpackage.fz2
    public void f(l99 l99Var) {
        q92 q92Var = (q92) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        q92Var.b.set((q92) l99Var.get());
    }

    @Override // defpackage.zk0
    public long g(long j) {
        bi4 bi4Var = (bi4) this.b;
        return a2d.j((j * bi4Var.e) / 1000000, 0L, bi4Var.j - 1);
    }

    @Override // defpackage.xo9
    public void i(long j, km8 km8Var) {
        p1d.g(j, km8Var, ((us4) this.b).K);
    }

    @Override // defpackage.or6
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 9:
                ((l57) ((dd) obj)).o = (pz3) obj2;
                return;
            case 10:
                ar2 ar2Var = (ar2) obj2;
                l57 l57Var = (l57) ((dd) obj);
                l57Var.y += ar2Var.g;
                l57Var.z += ar2Var.e;
                return;
            case 11:
                l57 l57Var2 = (l57) ((dd) obj);
                l57Var2.getClass();
                l57Var2.w = ((h57) obj2).a;
                return;
            case 12:
            case 13:
            default:
                ((az8) obj).D((tb7) obj2);
                return;
            case 14:
                ((az8) obj).t((j57) obj2);
                return;
            case 15:
                ((az8) obj).f((kjc) obj2);
                return;
            case 16:
                ((az8) obj).p((ud2) obj2);
                return;
            case 17:
                ((az8) obj).t(((c04) obj2).a.S);
                return;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:1|(1:3)(1:192)|(6:5|6|7|(2:15|(1:17)(1:18))|20|(0)(0))|23|109|30|(1:32)(1:185)|33|(1:35)|(1:37)(1:184)|38|(3:180|181|(45:183|54|(1:56)|57|(3:59|(2:61|62)(1:64)|63)|65|66|67|68|69|(1:71)|72|(1:74)|(1:76)(1:172)|77|(4:80|(2:82|83)(1:85)|84|78)|86|87|(1:89)|90|91|(1:93)(1:171)|(1:95)(1:170)|96|(5:157|(1:159)|160|488|165)(1:100)|101|(17:105|(1:107)(2:153|(1:155))|108|109|(2:111|(1:113))(2:149|(2:151|152))|114|115|116|117|118|119|120|(3:141|(1:143)|144)(3:128|(1:130)|131)|132|133|(2:135|(1:137))|138)|156|109|(0)(0)|114|115|116|117|118|119|120|(2:122|124)|141|(0)|144|132|133|(0)|138))(3:42|(3:176|177|(1:179))(4:46|(2:49|47)|50|51)|52)|53|54|(0)|57|(0)|65|66|67|68|69|(0)|72|(0)|(0)(0)|77|(1:78)|86|87|(0)|90|91|(0)(0)|(0)(0)|96|(1:98)|157|(0)|160|488|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(45:183|54|(1:56)|57|(3:59|(2:61|62)(1:64)|63)|65|66|67|68|69|(1:71)|72|(1:74)|(1:76)(1:172)|77|(4:80|(2:82|83)(1:85)|84|78)|86|87|(1:89)|90|91|(1:93)(1:171)|(1:95)(1:170)|96|(5:157|(1:159)|160|488|165)(1:100)|101|(17:105|(1:107)(2:153|(1:155))|108|109|(2:111|(1:113))(2:149|(2:151|152))|114|115|116|117|118|119|120|(3:141|(1:143)|144)(3:128|(1:130)|131)|132|133|(2:135|(1:137))|138)|156|109|(0)(0)|114|115|116|117|118|119|120|(2:122|124)|141|(0)|144|132|133|(0)|138) */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0635, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0652, code lost:
        android.util.Log.e(r3, "Crashlytics was not started due to an exception during initialization", r0);
        r39.g = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x06b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06b4, code lost:
        android.util.Log.e(r3, "Error retrieving app package info.", r0);
        r15 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0489 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03a8 A[LOOP:3: B:94:0x03a6->B:95:0x03a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ce  */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, fz2] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, mce] */
    /* JADX WARN: Type inference failed for: r4v22, types: [tc0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [wf2, java.lang.Object] */
    @Override // defpackage.hu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.yv r42) {
        /*
            Method dump skipped, instructions count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q6.j(yv):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = this.a;
        b65 b65Var = (b65) this.b;
        switch (i) {
            case 24:
                int i2 = HiddenActivity.c;
                b65Var.invoke(obj);
                return;
            case 25:
                int i3 = HiddenActivity.c;
                b65Var.invoke(obj);
                return;
            case 26:
                int i4 = HiddenActivity.c;
                b65Var.invoke(obj);
                return;
            default:
                int i5 = HiddenActivity.c;
                b65Var.invoke(obj);
                return;
        }
    }

    @Override // org.mozilla.javascript.ContextAction
    public Object run(Context context) {
        return JavaAdapter.a((Script) this.b, context);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 7:
                return (Task) ((Callable) obj).call();
            case 8:
                ((Runnable) obj).run();
                return Tasks.forResult(null);
            case 22:
                String str = (String) obj;
                if (task.isSuccessful()) {
                    String str2 = (String) task.getResult();
                    if (!TextUtils.isEmpty(str2) && str2.endsWith(str)) {
                        return str;
                    }
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                throw new ExecutionException(task.getException());
            default:
                ((yv) obj).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if (!"RST".equals(string2)) {
                        if (string2 != null) {
                            fb4.k(string2);
                            return null;
                        }
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        fb4.k("SERVICE_NOT_AVAILABLE");
                        return null;
                    }
                    fb4.k("INSTANCE_ID_RESET");
                    return null;
                }
                fb4.k("SERVICE_NOT_AVAILABLE");
                return null;
        }
    }

    @Override // defpackage.t38
    public void v(y28 y28Var, int i) {
        StringBuilder sb = (StringBuilder) this.b;
        if (y28Var instanceof cg2) {
            sb.append(((cg2) y28Var).H());
        } else if (y28Var instanceof sp1) {
            sb.append(((sp1) y28Var).H());
        } else if (y28Var instanceof l41) {
            sb.append(((l41) y28Var).H());
        }
    }

    public /* synthetic */ q6(cd cdVar, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ q6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
