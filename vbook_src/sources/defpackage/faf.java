package defpackage;

import java.io.File;
import java.io.FileInputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: faf  reason: default package */
/* loaded from: classes.dex */
public final class faf extends kaf implements w9f {
    public final File a;

    public faf(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = file;
    }

    @Override // defpackage.w9f
    public final File zza() {
        return this.a;
    }
}
