package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l00  reason: default package */
/* loaded from: classes.dex */
public final class l00 extends ih0 {
    public InputStream C;
    public long D;
    public boolean E;
    public final AssetManager e;
    public Uri f;

    public l00(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.jg2
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.C;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new kg2(e, 2000);
            }
        } finally {
            this.C = null;
            if (this.E) {
                this.E = false;
                c();
            }
        }
    }

    @Override // defpackage.jg2
    public final long d(mg2 mg2Var) {
        int i;
        try {
            Uri uri = mg2Var.a;
            long j = mg2Var.e;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            g();
            InputStream open = this.e.open(path, 1);
            this.C = open;
            if (open.skip(j) >= j) {
                long j2 = mg2Var.f;
                if (j2 != -1) {
                    this.D = j2;
                } else {
                    long available = this.C.available();
                    this.D = available;
                    if (available == 2147483647L) {
                        this.D = -1L;
                    }
                }
                this.E = true;
                k(mg2Var);
                return this.D;
            }
            throw new kg2(null, 2008);
        } catch (k00 e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            } else {
                i = 2000;
            }
            throw new kg2(e2, i);
        }
    }

    @Override // defpackage.eg2
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.D;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new kg2(e, 2000);
                }
            }
            InputStream inputStream = this.C;
            String str = a2d.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.D;
                if (j2 != -1) {
                    this.D = j2 - read;
                }
                b(read);
                return read;
            }
        }
        return -1;
    }

    @Override // defpackage.jg2
    public final Uri t() {
        return this.f;
    }
}
