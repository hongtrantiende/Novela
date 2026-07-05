package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gh9  reason: default package */
/* loaded from: classes.dex */
public final class gh9 extends ih0 {
    public AssetFileDescriptor C;
    public FileInputStream D;
    public long E;
    public boolean F;
    public final Context e;
    public mg2 f;

    public gh9(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
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
                        throw new kg2(null, e, 2000);
                    }
                } finally {
                    this.C = null;
                    if (this.F) {
                        this.F = false;
                        c();
                    }
                }
            } catch (IOException e2) {
                throw new kg2(null, e2, 2000);
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
                    throw new kg2(null, e3, 2000);
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
        String host;
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        long min;
        this.f = mg2Var;
        g();
        Uri uri = mg2Var.a;
        long j = mg2Var.f;
        long j2 = mg2Var.e;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.e;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                try {
                    i = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new kg2("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                int size = pathSegments.size();
                throw new kg2("rawresource:// URI must have exactly one path element, found " + size, null, 2000);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new kg2("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new kg2("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(eub.o(host, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new kg2("Resource not found.", null, 2005);
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        } else {
            String scheme = normalizeScheme.getScheme();
            throw new kg2("Unsupported URI scheme (" + scheme + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd != null) {
                this.C = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(this.C.getFileDescriptor());
                this.D = fileInputStream;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                try {
                    if (i2 != 0 && j2 > length) {
                        throw new kg2(null, null, 2008);
                    }
                    long startOffset = this.C.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                    if (skip == j2) {
                        if (i2 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.E = -1L;
                            } else {
                                long size2 = channel.size() - channel.position();
                                this.E = size2;
                                if (size2 < 0) {
                                    throw new kg2(null, null, 2008);
                                }
                            }
                        } else {
                            long j3 = length - skip;
                            this.E = j3;
                            if (j3 < 0) {
                                throw new kg2(2008);
                            }
                        }
                        int i3 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                        if (i3 != 0) {
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
                        if (i3 != 0) {
                            return j;
                        }
                        return this.E;
                    }
                    throw new kg2(null, null, 2008);
                } catch (fh9 e2) {
                    throw e2;
                } catch (IOException e3) {
                    throw new kg2(null, e3, 2000);
                }
            }
            throw new kg2("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e4) {
            throw new kg2(null, e4, 2005);
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
                    throw new kg2(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.D;
            String str = a2d.a;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.E;
            if (read == -1) {
                if (j2 != -1) {
                    throw new kg2("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
            } else {
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
        mg2 mg2Var = this.f;
        if (mg2Var != null) {
            return mg2Var.a;
        }
        return null;
    }
}
