package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y12  reason: default package */
/* loaded from: classes.dex */
public final class y12 extends ih0 {
    public AssetFileDescriptor C;
    public FileInputStream D;
    public long E;
    public boolean F;
    public final ContentResolver e;
    public Uri f;

    public y12(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // defpackage.jg2
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.D;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.D = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.C;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new kg2(e, 2000);
                    }
                } finally {
                    this.C = null;
                    if (this.F) {
                        this.F = false;
                        c();
                    }
                }
            } catch (IOException e2) {
                throw new kg2(e2, 2000);
            }
        } catch (Throwable th) {
            this.D = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.C;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.C = null;
                    if (this.F) {
                        this.F = false;
                        c();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new kg2(e3, 2000);
                }
            } finally {
                this.C = null;
                if (this.F) {
                    this.F = false;
                    c();
                }
            }
        }
    }

    @Override // defpackage.jg2
    public final long d(mg2 mg2Var) {
        int i;
        int i2;
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        try {
            try {
                Uri uri = mg2Var.a;
                long j = mg2Var.f;
                long j2 = mg2Var.e;
                Uri normalizeScheme = uri.normalizeScheme();
                this.f = normalizeScheme;
                g();
                boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.e;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.C = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.D = fileInputStream;
                    int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i3 != 0 && j2 > length) {
                        throw new kg2(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                    if (skip == j2) {
                        if (i3 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.E = -1L;
                            } else {
                                long position = size - channel.position();
                                this.E = position;
                                if (position < 0) {
                                    throw new kg2(null, 2008);
                                }
                            }
                        } else {
                            long j3 = length - skip;
                            this.E = j3;
                            if (j3 < 0) {
                                throw new kg2(null, 2008);
                            }
                        }
                        int i4 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                        if (i4 != 0) {
                            long j4 = this.E;
                            if (j4 == -1) {
                                min = j;
                            } else {
                                min = Math.min(j4, j);
                            }
                            this.E = min;
                        }
                        this.F = true;
                        k(mg2Var);
                        if (i4 != 0) {
                            return j;
                        }
                        return this.E;
                    }
                    throw new kg2(null, 2008);
                }
                i = 2000;
                try {
                    throw new kg2(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                } catch (IOException e) {
                    e = e;
                    if (e instanceof FileNotFoundException) {
                        i2 = 2005;
                    } else {
                        i2 = i;
                    }
                    throw new kg2(e, i2);
                }
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (x12 e3) {
            throw e3;
        }
    }

    @Override // defpackage.eg2
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.E;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new kg2(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.D;
            String str = a2d.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.E;
                if (j2 != -1) {
                    this.E = j2 - read;
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
