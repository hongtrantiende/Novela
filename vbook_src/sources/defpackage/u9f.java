package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u9f  reason: default package */
/* loaded from: classes.dex */
public final class u9f implements ebf {
    @Override // defpackage.ebf
    public final faf a(Uri uri) {
        File q = p1d.q(uri);
        return new faf(new FileInputStream(q), q);
    }

    @Override // defpackage.ebf
    public final boolean b(Uri uri) {
        return p1d.q(uri).exists();
    }

    @Override // defpackage.ebf
    public final File c(Uri uri) {
        return p1d.q(uri);
    }

    @Override // defpackage.ebf
    public final OutputStream d(Uri uri) {
        File q = p1d.q(uri);
        b16.o(q);
        return new haf(new FileOutputStream(q), q);
    }

    @Override // defpackage.ebf
    public final void e(Uri uri) {
        File q = p1d.q(uri);
        if (!q.isDirectory()) {
            if (!q.delete()) {
                if (!q.exists()) {
                    throw new FileNotFoundException(String.format("%s does not exist", uri));
                }
                throw new IOException(String.format("%s could not be deleted", uri));
            }
            return;
        }
        throw new FileNotFoundException(String.format("%s is a directory", uri));
    }

    @Override // defpackage.ebf
    public final void f(Uri uri, Uri uri2) {
        File q = p1d.q(uri);
        File q2 = p1d.q(uri2);
        b16.o(q2);
        if (q.renameTo(q2)) {
            return;
        }
        throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
    }

    @Override // defpackage.ebf
    public final String zzc() {
        return "file";
    }
}
