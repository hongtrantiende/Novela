package defpackage;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.pdf.component.PdfPageImageObject;
import android.graphics.pdf.component.PdfPageObject;
import android.graphics.pdf.models.selection.PageSelection;
import android.graphics.pdf.models.selection.SelectionBoundary;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import android.util.Pair;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hp8  reason: default package */
/* loaded from: classes.dex */
public final class hp8 extends ep8 {
    public final kp8 b;
    public ip8 c;
    public yh8 d;
    public kj e;

    /* JADX WARN: Type inference failed for: r0v0, types: [kp8, java.lang.Object] */
    public hp8() {
        ?? obj = new Object();
        attachInterface(this, fp8.k);
        this.b = obj;
    }

    public static ro5 a(PointF pointF, int[] iArr, kq8 kq8Var) {
        kq8Var.getClass();
        Pair D = kq8Var.D(pointF, iArr);
        if (D != null) {
            Object obj = D.second;
            obj.getClass();
            PdfPageImageObject pdfPageImageObject = (PdfPageObject) obj;
            if (pdfPageImageObject instanceof PdfPageImageObject) {
                PdfPageImageObject pdfPageImageObject2 = pdfPageImageObject;
                float[] matrix = pdfPageImageObject2.getMatrix();
                matrix.getClass();
                Matrix matrix2 = new Matrix();
                matrix2.setValues(matrix);
                RectF rectF = new RectF(nae.e, nae.e, 1.0f, 1.0f);
                RectF rectF2 = new RectF();
                matrix2.mapRect(rectF2, rectF);
                Bitmap bitmap = pdfPageImageObject2.getBitmap();
                bitmap.getClass();
                return new ro5(bitmap, rectF2);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.fp8
    public final Bitmap A(int i, int i2, int i3, yn9 yn9Var) {
        yn9Var.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        createBitmap.eraseColor(-1);
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(31) >= 13) {
            ip8 ip8Var = this.c;
            if (ip8Var != null) {
                ip8Var.F(i, true).v0(createBitmap, yn9Var);
                return createBitmap;
            }
            c16.w("rendererAdapter");
            throw null;
        }
        ip8 ip8Var2 = this.c;
        if (ip8Var2 != null) {
            pvc pvcVar = (pvc) ip8Var2.L(i, new fl7(20, createBitmap, yn9Var));
            return createBitmap;
        }
        c16.w("rendererAdapter");
        throw null;
    }

    @Override // defpackage.fp8
    public final void E() {
        boolean isTerminated;
        ip8 ip8Var = this.c;
        if (ip8Var != null) {
            if (ip8Var instanceof AutoCloseable) {
                ip8Var.close();
                return;
            } else if (ip8Var instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) ip8Var;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
                return;
            } else if (ip8Var instanceof TypedArray) {
                ((TypedArray) ip8Var).recycle();
                return;
            } else if (ip8Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) ip8Var).release();
                return;
            } else if (ip8Var instanceof MediaDrm) {
                ((MediaDrm) ip8Var).release();
                return;
            } else {
                p1a.g();
                return;
            }
        }
        c16.w("rendererAdapter");
        throw null;
    }

    @Override // defpackage.fp8
    public final b73 F(int i) {
        kq8 kq8Var;
        try {
            ip8 ip8Var = this.c;
            if (ip8Var != null) {
                try {
                    kq8Var = ip8Var.F(i, false);
                } catch (Throwable th) {
                    th = th;
                    kq8Var = null;
                }
                try {
                    kq8Var.getClass();
                    b73 b73Var = new b73(kq8Var.e(), kq8Var.d());
                    ip8Var.U(i, kq8Var);
                    return b73Var;
                } catch (Throwable th2) {
                    th = th2;
                    ip8Var.U(i, kq8Var);
                    throw th;
                }
            }
            c16.w("rendererAdapter");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // defpackage.fp8
    public final Bitmap K(int i, int i2, int i3, final int i4, final int i5, final int i6, final int i7, final yn9 yn9Var) {
        yn9Var.getClass();
        final Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        createBitmap.eraseColor(-1);
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(31) >= 13) {
            ip8 ip8Var = this.c;
            if (ip8Var != null) {
                ip8Var.F(i, true).Y(createBitmap, i6, i7, i4, i5, yn9Var);
                return createBitmap;
            }
            c16.w("rendererAdapter");
            throw null;
        }
        ip8 ip8Var2 = this.c;
        if (ip8Var2 != null) {
            pvc pvcVar = (pvc) ip8Var2.L(i, new xt4() { // from class: gp8
                @Override // defpackage.xt4
                public final Object invoke(Object obj) {
                    kq8 kq8Var = (kq8) obj;
                    kq8Var.getClass();
                    kq8Var.Y(createBitmap, i6, i7, i4, i5, yn9Var);
                    return pvc.a;
                }
            });
            return createBitmap;
        }
        c16.w("rendererAdapter");
        throw null;
    }

    @Override // defpackage.fp8
    public final void M(int i) {
        ip8 ip8Var = this.c;
        if (ip8Var != null) {
            ip8Var.U(i, null);
        } else {
            c16.w("rendererAdapter");
            throw null;
        }
    }

    @Override // defpackage.fp8
    public final int h() {
        ip8 ip8Var = this.c;
        if (ip8Var != null) {
            return ip8Var.h();
        }
        c16.w("rendererAdapter");
        throw null;
    }

    @Override // defpackage.fp8
    public final int i() {
        ip8 ip8Var = this.c;
        if (ip8Var != null) {
            return ip8Var.i();
        }
        c16.w("rendererAdapter");
        throw null;
    }

    @Override // defpackage.fp8
    public final PageSelection m(int i, SelectionBoundary selectionBoundary, SelectionBoundary selectionBoundary2) {
        selectionBoundary.getClass();
        selectionBoundary2.getClass();
        ip8 ip8Var = this.c;
        kq8 kq8Var = null;
        if (ip8Var != null) {
            try {
                kq8Var = ip8Var.F(i, false);
                kq8Var.getClass();
                return kq8Var.O0(selectionBoundary, selectionBoundary2);
            } finally {
                ip8Var.U(i, kq8Var);
            }
        }
        c16.w("rendererAdapter");
        throw null;
    }

    @Override // defpackage.fp8
    public final int s() {
        ip8 ip8Var = this.c;
        if (ip8Var != null) {
            return ip8Var.h0();
        }
        c16.w("rendererAdapter");
        throw null;
    }

    @Override // defpackage.fp8
    public final int x(ParcelFileDescriptor parcelFileDescriptor, String str) {
        parcelFileDescriptor.getClass();
        try {
            this.c = ((zt0) this.b).a(parcelFileDescriptor, str);
            if (qka.m(18)) {
                ip8 ip8Var = this.c;
                if (ip8Var != null) {
                    this.d = new yh8(ip8Var, 1);
                    return 0;
                }
                c16.w("rendererAdapter");
                throw null;
            }
            return 0;
        } catch (IllegalArgumentException unused) {
            return 2;
        } catch (SecurityException unused2) {
            return 1;
        } catch (Exception unused3) {
            return 4;
        }
    }
}
