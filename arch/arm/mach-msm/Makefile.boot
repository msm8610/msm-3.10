# MSM8974
   zreladdr-$(CONFIG_ARCH_MSM8974)	:= 0x00008000

# APQ8084
   zreladdr-$(CONFIG_ARCH_APQ8084)	:= 0x00008000

# MDM9630
   zreladdr-$(CONFIG_ARCH_MDM9630)	:= 0x00008000

# MDM9640
   zreladdr-$(CONFIG_ARCH_MDM9640)	:= 0x80008000

# MSMVPIPA
   zreladdr-$(CONFIG_ARCH_MSMVPIPA)	:= 0x80008000

# MSM8226
   zreladdr-$(CONFIG_ARCH_MSM8226)	:= 0x00008000

# FSM9900
   zreladdr-$(CONFIG_ARCH_FSM9900)	:= 0x0b608000

# FSM9010
   zreladdr-$(CONFIG_ARCH_FSM9010)	:= 0x0b608000

# MSM8610
   zreladdr-$(CONFIG_ARCH_MSM8610)	:= 0x00008000
# Do not include MSM8610 in Shuang Board
ifeq ($(CONFIG_MACH_SONY_SHUANG),y)
        dtb-$(CONFIG_ARCH_MSM8610)	+= msm8610-shuang-v2-mtp.dtb
else
        dtb-$(CONFIG_ARCH_MSM8610)	+= msm8610-v1-cdp.dtb
        dtb-$(CONFIG_ARCH_MSM8610)	+= msm8610-v2-cdp.dtb
        dtb-$(CONFIG_ARCH_MSM8610)	+= msm8610-v1-mtp.dtb
        dtb-$(CONFIG_ARCH_MSM8610)	+= msm8610-v2-mtp.dtb
        dtb-$(CONFIG_ARCH_MSM8610)	+= msm8610-rumi.dtb
        dtb-$(CONFIG_ARCH_MSM8610)	+= msm8610-sim.dtb
        dtb-$(CONFIG_ARCH_MSM8610)	+= msm8610-v1-qrd-skuaa.dtb
        dtb-$(CONFIG_ARCH_MSM8610)	+= msm8610-v1-qrd-skuab.dtb
        dtb-$(CONFIG_ARCH_MSM8610)	+= msm8610-v2-qrd-skuaa.dtb
        dtb-$(CONFIG_ARCH_MSM8610)	+= msm8610-v2-qrd-skuab.dtb
endif
