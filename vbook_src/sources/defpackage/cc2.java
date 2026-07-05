package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cc2  reason: default package */
/* loaded from: classes.dex */
public final class cc2 extends yb2 {
    public final Context d;
    public rb2 e;
    public Executor f;
    public CancellationSignal g;
    public final vb2 h;

    public cc2(Context context) {
        context.getClass();
        this.d = context;
        this.h = new vb2(this, new Handler(Looper.getMainLooper()), 1);
    }

    public final rx4 d(vka vkaVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        String str5 = vkaVar.C;
        o05 o05Var = null;
        if (str5 != null) {
            String str6 = vkaVar.a;
            str6.getClass();
            String str7 = vkaVar.b;
            if (str7 != null) {
                str = str7;
            } else {
                str = null;
            }
            String str8 = vkaVar.c;
            if (str8 != null) {
                str2 = str8;
            } else {
                str2 = null;
            }
            String str9 = vkaVar.d;
            if (str9 != null) {
                str3 = str9;
            } else {
                str3 = null;
            }
            String str10 = vkaVar.D;
            if (str10 != null) {
                str4 = str10;
            } else {
                str4 = null;
            }
            Uri uri2 = vkaVar.e;
            if (uri2 != null) {
                uri = uri2;
            } else {
                uri = null;
            }
            o05Var = new o05(str6, str5, str, str3, str2, uri, str4);
        } else {
            Log.w("GetSignInIntent", "Credential returned but no google Id found");
        }
        if (o05Var != null) {
            return new rx4(o05Var);
        }
        throw new ox4("When attempting to convert get response, null credential found", 3);
    }

    public final rb2 e() {
        rb2 rb2Var = this.e;
        if (rb2Var != null) {
            return rb2Var;
        }
        c16.w("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f;
        if (executor != null) {
            return executor;
        }
        c16.w("executor");
        throw null;
    }
}
