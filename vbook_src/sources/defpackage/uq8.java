package defpackage;

import android.content.res.TypedArray;
import android.graphics.pdf.PdfRenderer;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uq8  reason: default package */
/* loaded from: classes.dex */
public final class uq8 implements ip8 {
    public final mu9 a;
    public final PdfRenderer b;

    public uq8(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.getClass();
        this.a = new mu9(28, false);
        this.b = new PdfRenderer(parcelFileDescriptor);
    }

    @Override // defpackage.ip8
    public final void A(ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        throw new UnsupportedOperationException("Operation supported above S");
    }

    @Override // defpackage.ip8
    public final kq8 F(int i, boolean z) {
        return this.a.t(i, new t93(this, i, 6), z);
    }

    @Override // defpackage.ip8
    public final void U(int i, kq8 kq8Var) {
        boolean isTerminated;
        boolean isTerminated2;
        boolean isTerminated3;
        kq8 kq8Var2 = (kq8) ((ConcurrentHashMap) this.a.a).remove(Integer.valueOf(i));
        TimeUnit timeUnit = TimeUnit.DAYS;
        boolean z = false;
        if (kq8Var2 == null) {
            if (kq8Var != null) {
                if (kq8Var instanceof AutoCloseable) {
                    kq8Var.close();
                    return;
                } else if (kq8Var instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) kq8Var;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated3 = executorService.isTerminated())) {
                        executorService.shutdown();
                        while (!isTerminated3) {
                            try {
                                isTerminated3 = executorService.awaitTermination(1L, timeUnit);
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
                } else if (kq8Var instanceof TypedArray) {
                    ((TypedArray) kq8Var).recycle();
                    return;
                } else if (kq8Var instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) kq8Var).release();
                    return;
                } else if (kq8Var instanceof MediaDrm) {
                    ((MediaDrm) kq8Var).release();
                    return;
                } else {
                    p1a.g();
                    return;
                }
            }
            return;
        }
        if (kq8Var2 instanceof AutoCloseable) {
            kq8Var2.close();
        } else if (kq8Var2 instanceof ExecutorService) {
            ExecutorService executorService2 = (ExecutorService) kq8Var2;
            if (executorService2 != ForkJoinPool.commonPool() && !(isTerminated = executorService2.isTerminated())) {
                executorService2.shutdown();
                boolean z2 = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService2.awaitTermination(1L, timeUnit);
                    } catch (InterruptedException unused2) {
                        if (!z2) {
                            executorService2.shutdownNow();
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if (kq8Var2 instanceof TypedArray) {
            ((TypedArray) kq8Var2).recycle();
        } else if (kq8Var2 instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) kq8Var2).release();
        } else if (kq8Var2 instanceof MediaDrm) {
            ((MediaDrm) kq8Var2).release();
        } else {
            p1a.g();
            return;
        }
        if (!c16.i(kq8Var, kq8Var2) && kq8Var != null) {
            if (kq8Var instanceof AutoCloseable) {
                kq8Var.close();
            } else if (kq8Var instanceof ExecutorService) {
                ExecutorService executorService3 = (ExecutorService) kq8Var;
                if (executorService3 != ForkJoinPool.commonPool() && !(isTerminated2 = executorService3.isTerminated())) {
                    executorService3.shutdown();
                    while (!isTerminated2) {
                        try {
                            isTerminated2 = executorService3.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused3) {
                            if (!z) {
                                executorService3.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (kq8Var instanceof TypedArray) {
                ((TypedArray) kq8Var).recycle();
            } else if (kq8Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) kq8Var).release();
            } else if (kq8Var instanceof MediaDrm) {
                ((MediaDrm) kq8Var).release();
            } else {
                p1a.g();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.l();
        this.b.close();
    }

    @Override // defpackage.ip8
    public final int h() {
        throw new UnsupportedOperationException("Operation supported above S + SDK extension >= 13");
    }

    @Override // defpackage.ip8
    public final int h0() {
        return this.b.getPageCount();
    }

    @Override // defpackage.ip8
    public final int i() {
        throw new UnsupportedOperationException("Operation supported above S + SDK extension >= 13");
    }
}
