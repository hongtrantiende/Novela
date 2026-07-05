package defpackage;

import android.content.res.TypedArray;
import android.graphics.pdf.LoadParams;
import android.graphics.pdf.PdfRenderer;
import android.graphics.pdf.PdfRendererPreV;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jp8  reason: default package */
/* loaded from: classes.dex */
public final class jp8 implements ip8 {
    public final /* synthetic */ int a;
    public final mu9 b;
    public final AutoCloseable c;

    public jp8(ParcelFileDescriptor parcelFileDescriptor, String str, int i) {
        this.a = i;
        parcelFileDescriptor.getClass();
        switch (i) {
            case 1:
                this.c = new PdfRendererPreV(parcelFileDescriptor, new LoadParams.Builder().setPassword(str).build());
                this.b = new mu9(28, false);
                return;
            default:
                this.c = new PdfRenderer(parcelFileDescriptor, new LoadParams.Builder().setPassword(str).build());
                this.b = new mu9(28, false);
                return;
        }
    }

    public static lq8 o(jp8 jp8Var, int i) {
        PdfRendererPreV.Page openPage = jp8Var.c.openPage(i);
        openPage.getClass();
        return new lq8(openPage);
    }

    @Override // defpackage.ip8
    public final void A(ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        int i = this.a;
        PdfRendererPreV pdfRendererPreV = this.c;
        switch (i) {
            case 0:
                ((PdfRenderer) pdfRendererPreV).write(parcelFileDescriptor, z);
                return;
            default:
                pdfRendererPreV.write(parcelFileDescriptor, z);
                return;
        }
    }

    @Override // defpackage.ip8
    public final kq8 F(int i, boolean z) {
        int i2 = this.a;
        mu9 mu9Var = this.b;
        switch (i2) {
            case 0:
                return mu9Var.t(i, new t93(this, i, 5), z);
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) mu9Var.a;
                if (!z) {
                    return o(this, i);
                }
                kq8 kq8Var = (kq8) concurrentHashMap.get(Integer.valueOf(i));
                if (kq8Var == null) {
                    lq8 o = o(this, i);
                    concurrentHashMap.put(Integer.valueOf(i), o);
                    return o;
                }
                return kq8Var;
        }
    }

    @Override // defpackage.ip8
    public final void U(int i, kq8 kq8Var) {
        boolean isTerminated;
        boolean isTerminated2;
        boolean isTerminated3;
        boolean isTerminated4;
        boolean isTerminated5;
        boolean isTerminated6;
        int i2 = this.a;
        mu9 mu9Var = this.b;
        boolean z = false;
        TimeUnit timeUnit = TimeUnit.DAYS;
        switch (i2) {
            case 0:
                kq8 kq8Var2 = (kq8) ((ConcurrentHashMap) mu9Var.a).remove(Integer.valueOf(i));
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
                        return;
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
            default:
                kq8 kq8Var3 = (kq8) ((ConcurrentHashMap) mu9Var.a).remove(Integer.valueOf(i));
                if (kq8Var3 == null) {
                    if (kq8Var != null) {
                        if (kq8Var instanceof AutoCloseable) {
                            kq8Var.close();
                            return;
                        } else if (kq8Var instanceof ExecutorService) {
                            ExecutorService executorService4 = (ExecutorService) kq8Var;
                            if (executorService4 != ForkJoinPool.commonPool() && !(isTerminated6 = executorService4.isTerminated())) {
                                executorService4.shutdown();
                                while (!isTerminated6) {
                                    try {
                                        isTerminated6 = executorService4.awaitTermination(1L, timeUnit);
                                    } catch (InterruptedException unused4) {
                                        if (!z) {
                                            executorService4.shutdownNow();
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
                if (kq8Var3 instanceof AutoCloseable) {
                    kq8Var3.close();
                } else if (kq8Var3 instanceof ExecutorService) {
                    ExecutorService executorService5 = (ExecutorService) kq8Var3;
                    if (executorService5 != ForkJoinPool.commonPool() && !(isTerminated4 = executorService5.isTerminated())) {
                        executorService5.shutdown();
                        boolean z3 = false;
                        while (!isTerminated4) {
                            try {
                                isTerminated4 = executorService5.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused5) {
                                if (!z3) {
                                    executorService5.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (kq8Var3 instanceof TypedArray) {
                    ((TypedArray) kq8Var3).recycle();
                } else if (kq8Var3 instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) kq8Var3).release();
                } else if (kq8Var3 instanceof MediaDrm) {
                    ((MediaDrm) kq8Var3).release();
                } else {
                    p1a.g();
                    return;
                }
                if (!c16.i(kq8Var, kq8Var3) && kq8Var != null) {
                    if (kq8Var instanceof AutoCloseable) {
                        kq8Var.close();
                        return;
                    } else if (kq8Var instanceof ExecutorService) {
                        ExecutorService executorService6 = (ExecutorService) kq8Var;
                        if (executorService6 != ForkJoinPool.commonPool() && !(isTerminated5 = executorService6.isTerminated())) {
                            executorService6.shutdown();
                            while (!isTerminated5) {
                                try {
                                    isTerminated5 = executorService6.awaitTermination(1L, timeUnit);
                                } catch (InterruptedException unused6) {
                                    if (!z) {
                                        executorService6.shutdownNow();
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
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                this.b.l();
                ((PdfRenderer) this.c).close();
                return;
            default:
                this.b.l();
                this.c.close();
                return;
        }
    }

    @Override // defpackage.ip8
    public final int h() {
        switch (this.a) {
            case 0:
                return ((PdfRenderer) this.c).getPdfFormType();
            default:
                return this.c.getPdfFormType();
        }
    }

    @Override // defpackage.ip8
    public final int h0() {
        switch (this.a) {
            case 0:
                return ((PdfRenderer) this.c).getPageCount();
            default:
                return this.c.getPageCount();
        }
    }

    @Override // defpackage.ip8
    public final int i() {
        switch (this.a) {
            case 0:
                return ((PdfRenderer) this.c).getDocumentLinearizationType();
            default:
                return this.c.getDocumentLinearizationType();
        }
    }
}
