package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ir  reason: default package */
/* loaded from: classes.dex */
public final class ir implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vl9 b;
    public final /* synthetic */ xq2 c;

    public /* synthetic */ ir(xq2 xq2Var, vl9 vl9Var, int i) {
        this.a = i;
        this.c = xq2Var;
        this.b = vl9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v33, types: [android.graphics.ImageDecoder$OnPartialImageListener, java.lang.Object] */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3 = this.a;
        z29 z29Var = z29.a;
        vl9 vl9Var = this.b;
        xq2 xq2Var = this.c;
        switch (i3) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                xe8 xe8Var = ((lr) xq2Var).b;
                cna cnaVar = xe8Var.b;
                hz9 hz9Var = xe8Var.c;
                u4 u4Var = mp5.b;
                long u = ube.u(width, height, cnaVar, hz9Var, (cna) fca.k(xe8Var, u4Var));
                int i4 = (int) (u >> 32);
                int i5 = (int) (u & 4294967295L);
                if (width > 0 && height > 0 && (width != i4 || height != i5)) {
                    xe8 xe8Var2 = ((lr) xq2Var).b;
                    double v = ube.v(width, height, i4, i5, xe8Var2.c, (cna) fca.k(xe8Var2, u4Var));
                    if (v < 1.0d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    vl9Var.a = z;
                    if (z || ((lr) xq2Var).b.d == z29Var) {
                        imageDecoder.setTargetSize(k27.z(width * v), k27.z(v * height));
                    }
                }
                xe8 xe8Var3 = ((lr) xq2Var).b;
                if (h50.s(op5.b(xe8Var3))) {
                    i = 3;
                } else {
                    i = 1;
                }
                imageDecoder.setAllocator(i);
                imageDecoder.setMemorySizePolicy(!((Boolean) fca.k(xe8Var3, op5.g)).booleanValue());
                u4 u4Var2 = op5.c;
                if (p1a.f(fca.k(xe8Var3, u4Var2)) != null) {
                    imageDecoder.setTargetColorSpace(p1a.f(fca.k(xe8Var3, u4Var2)));
                }
                if (fca.k(xe8Var3, kp5.b) == null) {
                    imageDecoder.setPostProcessor(null);
                    return;
                } else {
                    vm1.h();
                    return;
                }
            default:
                Size size2 = imageInfo.getSize();
                int width2 = size2.getWidth();
                int height2 = size2.getHeight();
                xe8 xe8Var4 = ((sza) xq2Var).c;
                cna cnaVar2 = xe8Var4.b;
                hz9 hz9Var2 = xe8Var4.c;
                u4 u4Var3 = mp5.b;
                long u2 = ube.u(width2, height2, cnaVar2, hz9Var2, (cna) fca.k(xe8Var4, u4Var3));
                int i6 = (int) (u2 >> 32);
                int i7 = (int) (u2 & 4294967295L);
                if (width2 > 0 && height2 > 0 && (width2 != i6 || height2 != i7)) {
                    xe8 xe8Var5 = ((sza) xq2Var).c;
                    double v2 = ube.v(width2, height2, i6, i7, xe8Var5.c, (cna) fca.k(xe8Var5, u4Var3));
                    if (v2 < 1.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    vl9Var.a = z2;
                    if (z2 || ((sza) xq2Var).c.d == z29Var) {
                        imageDecoder.setTargetSize(k27.z(width2 * v2), k27.z(v2 * height2));
                    }
                }
                imageDecoder.setOnPartialImageListener(new Object());
                xe8 xe8Var6 = ((sza) xq2Var).c;
                if (h50.s(op5.b(xe8Var6))) {
                    i2 = 3;
                } else {
                    i2 = 1;
                }
                imageDecoder.setAllocator(i2);
                imageDecoder.setMemorySizePolicy(!((Boolean) fca.k(xe8Var6, op5.g)).booleanValue());
                u4 u4Var4 = op5.c;
                if (p1a.f(fca.k(xe8Var6, u4Var4)) != null) {
                    imageDecoder.setTargetColorSpace(p1a.f(fca.k(xe8Var6, u4Var4)));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) fca.k(xe8Var6, op5.d)).booleanValue());
                return;
        }
    }
}
