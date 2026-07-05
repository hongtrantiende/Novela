package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kc4  reason: default package */
/* loaded from: classes.dex */
public final class kc4 extends ih0 {
    public long C;
    public boolean D;
    public RandomAccessFile e;
    public Uri f;

    @Override // defpackage.jg2
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new kg2(e, 2000);
            }
        } finally {
            this.e = null;
            if (this.D) {
                this.D = false;
                c();
            }
        }
    }

    @Override // defpackage.jg2
    public final long d(mg2 mg2Var) {
        Uri uri = mg2Var.a;
        long j = mg2Var.e;
        this.f = uri;
        g();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = mg2Var.f;
                if (j2 == -1) {
                    j2 = this.e.length() - j;
                }
                this.C = j2;
                if (j2 >= 0) {
                    this.D = true;
                    k(mg2Var);
                    return this.C;
                }
                throw new kg2(null, null, 2008);
            } catch (IOException e) {
                throw new kg2(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new kg2(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2005 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder y = nk2.y("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            y.append(fragment);
            throw new kg2(y.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new kg2(e3, 2006);
        } catch (RuntimeException e4) {
            throw new kg2(e4, 2000);
        }
    }

    @Override // defpackage.eg2
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.C;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            String str = a2d.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.C -= read;
                b(read);
            }
            return read;
        } catch (IOException e) {
            throw new kg2(e, 2000);
        }
    }

    @Override // defpackage.jg2
    public final Uri t() {
        return this.f;
    }
}
