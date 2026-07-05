package defpackage;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iwa  reason: default package */
/* loaded from: classes.dex */
public abstract class iwa {
    public static final mm9 a = qs5.r(12);

    public static qs5 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new f1(1)).reversed());
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && a2d.M(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return qs5.l(treeSet);
    }

    public static qs5 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        qs5 qs5Var;
        int speakerLayoutChannelMask;
        boolean m = q1d.m(audioDeviceInfo.getType());
        mm9 mm9Var = a;
        if (!m) {
            if (audioDeviceInfo.getType() == 1) {
                return qs5.r(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return qs5.r(Integer.valueOf(speakerLayoutChannelMask));
                }
                st0.w("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return mm9Var;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && audioDeviceInfo.getType() == 10) {
                qs5 a2 = a(audioDeviceInfo);
                if (!a2.isEmpty()) {
                    return a2;
                }
                qs5 i2 = ih.i(audioDeviceInfo.getAudioDescriptors());
                if (!i2.isEmpty()) {
                    return i2;
                }
            } else {
                if (i >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i >= 31 && type2 == 29) {
                        qs5 a3 = a(audioDeviceInfo);
                        if (!a3.isEmpty()) {
                            return a3;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i >= 34) {
                            if (i >= 34 && audioDescriptors != null) {
                                ArrayList arrayList = new ArrayList();
                                for (AudioDescriptor audioDescriptor : audioDescriptors) {
                                    AudioDescriptor a4 = vs.a(audioDescriptor);
                                    if (a4.getStandard() == 2) {
                                        byte[] descriptor = a4.getDescriptor();
                                        if (descriptor.length != 3) {
                                            st0.w("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            int i3 = 0;
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b = descriptor[0];
                                                if ((b & 1) != 0) {
                                                    i3 = 12;
                                                }
                                                if ((b & 2) != 0) {
                                                    i3 |= 32;
                                                }
                                                if ((b & 4) != 0) {
                                                    i3 |= 16;
                                                }
                                                if ((b & 8) != 0) {
                                                    i3 |= 192;
                                                }
                                                if ((b & 16) != 0) {
                                                    i3 |= 1024;
                                                }
                                                if ((b & 32) != 0) {
                                                    i3 |= 768;
                                                }
                                                if ((b & 128) != 0) {
                                                    i3 |= 201326592;
                                                }
                                                byte b2 = descriptor[1];
                                                if ((b2 & 1) != 0) {
                                                    i3 |= 81920;
                                                }
                                                if ((b2 & 2) != 0) {
                                                    i3 |= 8192;
                                                }
                                                if ((b2 & 4) != 0) {
                                                    i3 |= 32768;
                                                }
                                                if ((b2 & 8) != 0) {
                                                    i3 |= 6144;
                                                }
                                                if ((b2 & 16) != 0) {
                                                    i3 |= 33554432;
                                                }
                                                if ((b2 & 32) != 0) {
                                                    i3 |= 262144;
                                                }
                                                if ((b2 & 64) != 0) {
                                                    i3 |= 6144;
                                                }
                                                if ((b2 & 128) != 0) {
                                                    i3 |= 3145728;
                                                }
                                                byte b3 = descriptor[2];
                                                if ((b3 & 1) != 0) {
                                                    i3 |= 655360;
                                                }
                                                if ((b3 & 2) != 0) {
                                                    i3 = 8388608 | i3;
                                                }
                                                if ((b3 & 4) != 0) {
                                                    i3 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(i3));
                                        }
                                    }
                                }
                                arrayList.sort(new uk(1));
                                qs5Var = qs5.l(arrayList);
                            } else {
                                ms5 ms5Var = qs5.b;
                                qs5Var = mm9.e;
                            }
                            if (!qs5Var.isEmpty()) {
                                return qs5Var;
                            }
                        }
                        qs5 i4 = ih.i(audioDescriptors);
                        if (!i4.isEmpty()) {
                            return i4;
                        }
                    }
                }
                if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    qs5 a5 = a(audioDeviceInfo);
                    if (!a5.isEmpty()) {
                        return a5;
                    }
                }
            }
        }
        return mm9Var;
    }
}
