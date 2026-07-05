package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f9f  reason: default package */
/* loaded from: classes.dex */
public final class f9f implements ebf {
    public final Context a;
    public String d;
    public final Object c = new Object();
    public final u9f b = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [u9f, java.lang.Object] */
    public f9f(lv2 lv2Var) {
        this.a = lv2Var.a;
    }

    @Override // defpackage.ebf
    public final faf a(Uri uri) {
        if (!h(uri)) {
            File q = p1d.q(g(uri));
            return new faf(new FileInputStream(q), q);
        }
        throw new IOException("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // defpackage.ebf
    public final boolean b(Uri uri) {
        if (!h(uri)) {
            return p1d.q(g(uri)).exists();
        }
        throw new IOException("Android backend cannot perform remote operations without a remote backend");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    @Override // defpackage.ebf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File c(android.net.Uri r10) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9f.c(android.net.Uri):java.io.File");
    }

    @Override // defpackage.ebf
    public final OutputStream d(Uri uri) {
        return this.b.d(g(uri));
    }

    @Override // defpackage.ebf
    public final void e(Uri uri) {
        this.b.e(g(uri));
    }

    @Override // defpackage.ebf
    public final void f(Uri uri, Uri uri2) {
        this.b.f(g(uri), g(uri2));
    }

    public final Uri g(Uri uri) {
        String concat;
        if (!h(uri)) {
            File c = c(uri);
            Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
            ls5 i = qs5.i();
            path.path(c.getAbsolutePath());
            mm9 g = i.g();
            Pattern pattern = paf.a;
            if (g.isEmpty()) {
                concat = null;
            } else {
                concat = "transform=".concat(new lie("+", 2).b(g));
            }
            return path.encodedFragment(concat).build();
        }
        throw new IOException("Operation across authorities is not allowed.");
    }

    public final boolean h(Uri uri) {
        if (!TextUtils.isEmpty(uri.getAuthority()) && !this.a.getPackageName().equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ebf
    public final String zzc() {
        return "android";
    }
}
